package state;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class Work {
	private int hour; // 更改状态的条件
	private State state; // 不同状态
	private boolean isFinished; // 判断状态的条件
	
	public Work() {
		this.state = new MorningState();
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public boolean isFinished() {
		return isFinished;
	}
	
	public void setFinished(boolean finished) {
		this.isFinished = finished;
	}
	
	public void writeProgram() {
		this.state.writeProgram(this);
	}
}
