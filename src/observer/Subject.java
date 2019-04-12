package observer;
import java.util.ArrayList;
import java.util.List;
/**
 * 抽象通知者
 * Created By Lu Chuan On 2019/4/7
 */
public class Subject {
	private List<Observer> observers = new ArrayList<>();
	
	// 增加观察者
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	// 移除观察者
	public void remove(Observer observer) {
		observers.remove(observer);
	}
	
	// 通知
	public void notifyAllObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
