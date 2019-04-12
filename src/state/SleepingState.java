package state;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class SleepingState implements State {
	@Override
	public void writeProgram(Work work) {
		System.out.println("当前时间：" + work.getHour() + "，睡觉");
	}
}
