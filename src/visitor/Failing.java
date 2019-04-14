package visitor;

/**
 * Created By Lu Chuan On 2019/4/14
 */
public class Failing implements Action {
	private String name = "失败";
	
	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getName() + this.name + "时：闷头喝酒谁也不用劝");
	}
	
	@Override
	public void getWomanConclusion(Woman concreteElementA) {
		System.out.println(concreteElementA.getName() + this.name + "时：眼泪汪汪谁也劝不了");
	}
}
