package factory;

/**
 * Created By Lu Chuan On 2019/4/6
 */
public class Main {
	public static void main(String[] args) {
		OperationFactory factory = new OperationAddFactory();
		Operation operation = factory.createOperation();
		operation.setNumberA(1);
		operation.setNumberB(2);
		System.out.println(operation.getResult());
	}
}
