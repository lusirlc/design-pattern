package adapter;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class Translator implements Player {
	ForeignCenter foreignCenter = new ForeignCenter();
	@Override
	public void attack() {
		foreignCenter.进攻();
	}
	
	@Override
	public void defence() {
		foreignCenter.防守();
	}
}
