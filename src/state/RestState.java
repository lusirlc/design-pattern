package state;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class RestState implements State {
	@Override
	public void writeProgram(Work work) {
		System.out.println("当前时间：" + work.getHour() + "，下班");
	}
}
