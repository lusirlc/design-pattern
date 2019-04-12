package state;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class NoonState implements State {
	@Override
	public void writeProgram(Work work) {
		if (work.getHour() < 13) {
			System.out.println("当前时间：" + work.getHour() + "，午休");
		} else {
			work.setState(new AfternoonState());
			work.writeProgram();
		}
	}
}
