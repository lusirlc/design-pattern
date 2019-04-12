package builder;

/**
 * Created By Lu Chuan On 2019/4/7
 */
public class PersonFatBuilder extends PersonBuilder {
	@Override
	public void buildHead() {
		System.out.println("画个头");
	}
	
	@Override
	public void buildBody() {
		System.out.println("画个胖身体");
	}
	
	@Override
	public void buildArmLeft() {
		System.out.println("画个左胳膊");
	}
	
	@Override
	public void buildArmRight() {
		System.out.println("画个右胳膊");
	}
	
	@Override
	public void buildLegLeft() {
		System.out.println("画个左腿");
	}
	
	@Override
	public void buildLegRight() {
		System.out.println("画个右腿");
	}
}
