package adapter;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class Center implements Player {
	@Override
	public void attack() {
		System.out.println("中锋进攻");
	}
	
	@Override
	public void defence() {
		System.out.println("中锋防守");
	}
}
