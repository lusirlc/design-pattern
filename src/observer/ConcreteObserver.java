package observer;

/**
 * Created By Lu Chuan On 2019/4/7
 */
public class ConcreteObserver implements Observer {
	private String name;
	private String observerState;
	private ConcreteSubject subject;
	
	public ConcreteObserver(String name, ConcreteSubject subject) {
		this.name = name;
		this.subject = subject;
	}
	
	
	@Override
	public void update() {
		observerState = subject.getSubjectState();
		System.out.println("观察者" + name + "的新状态是" + observerState);
	}
}
