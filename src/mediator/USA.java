package mediator;

/**
 * 美国
 * Created By Lu Chuan On 2019/4/13
 */
public class USA extends Country {
	public USA(UnitedNations mediator) {
		super(mediator);
	}
	
	@Override
	public void getMessage(String message) {
		System.out.println("美国获得对方消息："+message);
	}
	
	@Override
	public void declare(String message) {
		this.mediator.declare(message,this);
	}
}
