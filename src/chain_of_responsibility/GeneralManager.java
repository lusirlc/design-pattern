package chain_of_responsibility;

/**
 * 经理类
 * Created By Lu Chuan On 2019/4/13
 */
public class GeneralManager extends Manager {
	public GeneralManager(String name) {
		super(name);
	}
	
	@Override
	public void requestApplications(Request request) {
		if (request.getType() == "请假") {
			System.out.println(this.name + "答复：请求：" + request.getType() + "，数量：" + request.getCount() + "被批准");
		} else if (request.getType() == "加薪" && request.getCount() <= 500) {
			System.out.println(this.name + "答复：请求：" + request.getType() + "，数量：" + request.getCount() + "被批准");
		} else if (request.getType() == "加薪" && request.getCount() > 500) {
			System.out.println(this.name + "答复：再说吧");
		}
	}
}
