package adapter;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class Forwards implements Player {
	@Override
	public void attack() {
		System.out.println("前锋进攻");
	}
	
	@Override
	public void defence() {
		System.out.println("前锋防守");
	}
}
