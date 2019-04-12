package command;

/**
 * 命令模式：将一个请求封装成一个对象，从而可以使你可用不同的请求对客户进行参数化
 * 对请求排队或记录请求日志，以及支持可撤销的操作。
 * Created By Lu Chuan On 2019/4/11
 */
public class Main {
	public static void main(String[] args) {
		Barbecuer boy = new Barbecuer();
		Command chickenWingCommand = new BakeChickenWingCommand(boy);
		Command muttonCommand = new BakeMuttonCommand(boy);
		Waiter girl = new Waiter();
		
		girl.setOrder(chickenWingCommand);
		girl.setOrder(muttonCommand);
		
		girl.sendCommand();
	}
}
