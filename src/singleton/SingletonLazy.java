package singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 懒汉式单例模式：用到该类的时候才加载，但是会有线程安全问题
 * 为保证确实只创建一个实例对象，需要进行双重锁来保证
 * Created By Lu Chuan On 2019/4/11
 */
public class SingletonLazy {
	private static SingletonLazy singletonLazy;
	private static Lock lock = new ReentrantLock();
	
	private SingletonLazy() {
	}
	
	public static SingletonLazy newInstance() {
		if (singletonLazy == null) {
			lock.lock();
			if (singletonLazy == null) {
				singletonLazy = new SingletonLazy();
			}
			lock.unlock();
		}
		return singletonLazy;
	}
}
