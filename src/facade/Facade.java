package facade;

/**
 * Created By Lu Chuan On 2019/4/7
 */
public class Facade {
	private SubSystem1 system1;
	private SubSystem2 system2;
	private SubSystem3 system3;
	
	public Facade() {
		this.system1 = new SubSystem1();
		this.system2 = new SubSystem2();
		this.system3 = new SubSystem3();
	}
	
	public void fMethod1() {
		system1.method1();
		system2.method2();
	}
	public void fMethod2() {
		system2.method2();
		system3.method3();
	}
}
