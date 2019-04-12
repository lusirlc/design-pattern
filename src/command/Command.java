package command;

/**
 * Created By Lu Chuan On 2019/4/12
 */
public abstract class Command {
	protected Barbecuer receiver;
	protected String name;
	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}
	
	public abstract void executeCommand();
}
