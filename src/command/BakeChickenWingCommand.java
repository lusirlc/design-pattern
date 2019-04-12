package command;

/**
 * Created By Lu Chuan On 2019/4/12
 */
public class BakeChickenWingCommand extends Command {
	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
		super.name = "烤鸡翅";
	}
	
	@Override
	public void executeCommand() {
		receiver.bakeChickenWing();
	}
}
