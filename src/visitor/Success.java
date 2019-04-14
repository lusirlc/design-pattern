package visitor;

/**
 * Created By Lu Chuan On 2019/4/14
 */
public class Success implements Action {
	private String name = "成功";
	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getName() + this.name + "时：背后多半有一个伟大的女人");
	}
	
	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getName() + this.name + "时：背后大多有一个不成功的男人");
	}
}
