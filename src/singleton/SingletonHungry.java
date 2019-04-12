package singleton;

/**
 * 饿汉式单例模式：利用static唯一性，在程序运行时就加载
 * Created By Lu Chuan On 2019/4/11
 */
public class SingletonHungry {
	private static SingletonHungry singletonHungry = new SingletonHungry();
	
	private SingletonHungry() {
	}
	
	public static SingletonHungry newInstance(){
		return singletonHungry;
	}
	
}
