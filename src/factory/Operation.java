package factory;

/**
 * Created By Lu Chuan On 2019/4/4
 */
public abstract class Operation {
	protected double numberA;
	protected double numberB;
	
	public double getNumberA() {
		return numberA;
	}
	
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	
	public double getNumberB() {
		return numberB;
	}
	
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
	public abstract double getResult();
}
