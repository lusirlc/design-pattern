package simple_factory;

/**
 * Created By Lu Chuan On 2019/4/4
 */
public class OperationFactory {
	public static Operation createOperation(String operation) {
		switch (operation) {
			case "+":
				return new OperationAdd();
			case "-":
				return new OperationSub();
			case "*":
				return new OperationMul();
			case "/":
				return new OperationDiv();
		}
		return null;
	}
}

