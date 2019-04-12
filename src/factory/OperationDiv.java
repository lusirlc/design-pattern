package factory;

/**
 * Created By Lu Chuan On 2019/4/4
 */
public class OperationDiv extends Operation {
	
	
	@Override
	public double getResult() {
		double result;
		if (numberB == 0) {
			throw new RuntimeException("除数不能为0");
		} else {
			return numberA - numberB;
		}
	}
}
