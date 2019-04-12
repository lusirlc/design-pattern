package observer;

/**
 * 观察者模式又叫发布订阅模式
 * 定义了一种一对多的依赖关系，让多个观察者对象同时监听某个主题对象。
 * 这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己
 * Created By Lu Chuan On 2019/4/7
 */
public class Main {
	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();
		concreteSubject.setSubjectState("ABC");
		concreteSubject.attach(new ConcreteObserver("zhangsan",concreteSubject));
		concreteSubject.attach(new ConcreteObserver("lisi",concreteSubject));
		concreteSubject.attach(new ConcreteObserver("wangwu",concreteSubject));
		concreteSubject.notifyAllObserver();
	}
}
