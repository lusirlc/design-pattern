package bridge;

/**
 * Created By Lu Chuan On 2019/4/11
 */
public abstract class Brand {
	protected Soft soft;
	
	public void setSoft(Soft soft) {
		this.soft = soft;
	}
	
	public abstract void run();
}
