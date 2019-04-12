package pool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created By Lu Chuan On 2019/4/5
 */
public interface MysqlPool {
	// 初始化连接池
	void init();
	// 销毁连接池
	void destroy();
	// 取连接
	Connection getConn() throws SQLException, InterruptedException;
	// 释放连接
	void release(Connection connection);
}
