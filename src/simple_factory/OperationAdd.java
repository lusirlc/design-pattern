package simple_factory;

/**
 * Created By Lu Chuan On 2019/4/4
 */
public class OperationAdd extends Operation {
	
	
	@Override
	public double getResult() {
		return numberA + numberB;
	}
}
