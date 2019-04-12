package state;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class AfternoonState implements State {
	@Override
	public void writeProgram(Work work) {
		if (work.getHour() < 17) {
			System.out.println("当前时间：" + work.getHour() + "，继续努力");
		} else {
			work.setState(new EveningState());
			work.writeProgram();
		}
	}
}
