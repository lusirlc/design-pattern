package mediator;

/**
 * 国家抽象类
 * Created By Lu Chuan On 2019/4/13
 */
public abstract class Country {
	protected UnitedNations mediator;
	
	public Country(UnitedNations mediator) {
		this.mediator = mediator;
	}
	
	public abstract void getMessage(String message);
	
	public abstract void declare(String message);
}
