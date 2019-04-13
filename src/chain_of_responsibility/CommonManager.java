package chain_of_responsibility;

/**
 * 经理类
 * Created By Lu Chuan On 2019/4/13
 */
public class CommonManager extends Manager {
	public CommonManager(String name) {
		super(name);
	}
	
	@Override
	public void requestApplications(Request request) {
		if (request.getType() == "请假" && request.getCount() <= 2) {
			System.out.println(this.name+"答复：请求：" + request.getType() + "，数量：" + request.getCount()+"被批准");
		} else if (this.superManager != null) {
			System.out.println(this.name+"无权决定，向"+this.superManager.name+"提出请求");
			this.superManager.requestApplications(request);
		}
	}
}
