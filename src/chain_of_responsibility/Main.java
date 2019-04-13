package chain_of_responsibility;

/**
 * 职责链模式：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止
 * Created By Lu Chuan On 2019/4/12
 */
public class Main {
	public static void main(String[] args) {
		Manager commonManager = new CommonManager("经理");
		Manager majordomoManager = new MajordomoManager("总监");
		Manager generalManager = new GeneralManager("总经理");
		// 设置责任链
		commonManager.setSuperManager(majordomoManager);
		majordomoManager.setSuperManager(generalManager);
		
		// 请求
		Request request = new Request();
//		request.setType("请假");
		request.setType("加薪");
		request.setCount(700);
		
		// 提出请求
		commonManager.requestApplications(request);
	}
}
