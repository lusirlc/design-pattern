package simple_factory;
import java.util.Scanner;
/**
 * Created By Lu Chuan On 2019/4/4
 */
public class Main {
	public static void main(String[] args) {
		calculate();
	}
	
	public static void calculate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数字A:");
		String strNumberA = scanner.nextLine();
		System.out.println("请输入算数符号:");
		String strOperation = scanner.nextLine();
		System.out.println("请输入数字B:");
		String strNumberB = scanner.nextLine();
		Operation operation = OperationFactory.createOperation(strOperation);
		
		try {
			operation.setNumberA(Double.parseDouble(strNumberA));
			operation.setNumberB(Double.parseDouble(strNumberB));
			System.out.println("计算结果为：" + operation.getResult());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			scanner.close();
		}
	}
	
	
}
