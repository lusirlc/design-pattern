package adapter;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class Guards implements Player {
	@Override
	public void attack() {
		System.out.println("后卫进攻");
	}
	
	@Override
	public void defence() {
		System.out.println("后卫防守");
	}
}
