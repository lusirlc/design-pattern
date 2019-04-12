package command;

import java.util.ArrayList;
import java.util.List;
/**
 * Created By Lu Chuan On 2019/4/12
 */
public class Waiter {
	private List<Command> orders = new ArrayList<>();
	
	public void setOrder(Command command) {
		this.orders.add(command);
		System.out.println("增加订单："+command.name);
	}
	
	public void cancelOrder(Command command) {
		orders.remove(command);
		System.out.println("取消订单："+command.name);
	}
	
	public void sendCommand() {
		for (Command order : orders) {
			order.executeCommand();
		}
	}
}
