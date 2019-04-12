package factory;

/**
 * Created By Lu Chuan On 2019/4/6
 */
public class OperationDivFactory implements OperationFactory {
	
	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}
}
