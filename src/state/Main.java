package state;

/**
 * 状态模式：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类
 * Created By Lu Chuan On 2019/4/9
 */
public class Main {
	public static void main(String[] args) {
		Work work = new Work();
		work.setHour(9);
		work.writeProgram();
		work.setHour(10);
		work.writeProgram();
		work.setHour(12);
		work.writeProgram();
		work.setHour(13);
		work.writeProgram();
		work.setHour(17);
		work.setFinished(true);
//		work.setFinished(false);
		work.writeProgram();
		work.setHour(19);
		work.writeProgram();
		work.setHour(22);
		work.writeProgram();
	}
}
