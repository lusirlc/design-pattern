package command;

/**
 * Created By Lu Chuan On 2019/4/12
 */
public class BakeMuttonCommand extends Command {
	
	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
		super.name = "烤羊肉串";
	}
	
	@Override
	public void executeCommand() {
		receiver.bakeMutton();
	}
}
