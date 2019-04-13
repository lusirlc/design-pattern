package chain_of_responsibility;

/**
 * Created By Lu Chuan On 2019/4/13
 */
public abstract class Manager {
	protected String name;
	protected Manager superManager;
	
	public Manager(String name) {
		this.name = name;
	}
	
	public void setSuperManager(Manager superManager) {
		this.superManager = superManager;
	}
	
	public abstract void requestApplications(Request request);
}
