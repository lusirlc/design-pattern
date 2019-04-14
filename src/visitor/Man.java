package visitor;

/**
 * Created By Lu Chuan On 2019/4/14
 */
public class Man implements Person {
	private String name = "男人";
	
	public String getName() {
		return name;
	}
	
	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);
	}
}
