package singleton;

/**
 * 单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点
 * Created By Lu Chuan On 2019/4/11
 */
public class Main {
	public static void main(String[] args) {
		SingletonHungry singletonHungry1 = SingletonHungry.newInstance();
		SingletonHungry singletonHungry2 = SingletonHungry.newInstance();
		System.out.println(singletonHungry1);
		System.out.println(singletonHungry2);
		System.out.println(singletonHungry1==singletonHungry2);
		
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					SingletonLazy singletonLazy = SingletonLazy.newInstance();
					System.out.println(singletonLazy);
				}
			}).start();
		}
	}
}
