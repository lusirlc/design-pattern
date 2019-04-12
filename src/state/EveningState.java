package state;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class EveningState implements State {
	@Override
	public void writeProgram(Work work) {
		if (work.isFinished()) {
			work.setState(new RestState());
			work.writeProgram();
		}else {
			if (work.getHour() < 21) {
				System.out.println("当前时间：" + work.getHour() + "，加班");
			} else {
				work.setState(new SleepingState());
				work.writeProgram();
			}
		}
	}
}
