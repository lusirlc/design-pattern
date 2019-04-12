package adapter;

/**
 * 适配器模式：将一个类的接口转换成客户希望的另外一个接口。
 * Adapter模式使得原来由于接口不兼容而不能一起工作的那些类可以一起工作
 * Created By Lu Chuan On 2019/4/9
 */
public class Main {
	public static void main(String[] args) {
		Player forwards = new Forwards();
		Player center = new Center();
		Player guards = new Guards();
		Player translator = new Translator();
		forwards.attack();
		center.attack();
		guards.attack();
		translator.attack();
	}
}
