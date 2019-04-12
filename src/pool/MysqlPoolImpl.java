package pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created By Lu Chuan On 2019/4/5
 */
public class MysqlPoolImpl implements MysqlPool {
	// 最大连接数
	private int maxSize = 10;
	// 正在活动的连接
	private AtomicInteger activeSize = new AtomicInteger(0); // 保证线程安全
	// 空闲连接存放的地方
	private LinkedBlockingQueue<Connection> idle; // 线程安全的队列
	// 已用连接存放的地方
	private LinkedBlockingQueue<Connection> busy; // 线程安全的队列
	
	public MysqlPoolImpl(int maxSize) {
		this.maxSize = maxSize;
	}
	
	@Override
	public void init() {
		idle = new LinkedBlockingQueue<>();
		busy = new LinkedBlockingQueue<>();
	}
	
	@Override
	public void destroy() {
	
	}
	
	@Override
	public Connection getConn() throws SQLException {
		// 1. idle有值，直接取
		Connection connection = idle.poll();
		// 2. idle无值，返回null
		if (null != connection) { //
			busy.offer(connection);
			return connection;
		}
		// 3. idle无值，池子未满
		if (activeSize.get() < maxSize) {
			if (activeSize.incrementAndGet() <= maxSize) { // 线程一个一个执行，双重锁
				connection = DriverManager.getConnection("mysql:jdbc://localhost:3306/test", "root", "root");
				busy.offer(connection);
				return connection;
			}
		}
		// 4. busy全满，等待归还
		try {
			connection = idle.poll(10000, TimeUnit.MILLISECONDS); // 等待10秒再取
			if (null == connection) {
				System.out.println("等待超时");
				throw new RuntimeException("等待超时");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void release(Connection connection) {
		busy.remove(connection);
		idle.offer(connection);
	}
}
