package strategy;

/**
 * Created By Lu Chuan On 2019/4/4
 */
public class Main {
	private static double total = 0;
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		p1.setPrice(20.0);
		p2.setPrice(30.0);
		calculate(p1, 10);
		calculate(p2, 10);
		System.out.println(total);
		
//		CashSuper cashSuper = CashFactory.createSettleAccount("normal");
//		CashSuper cashSuper = CashFactory.createSettleAccount("rebate of 0.8");
//		CashSuper cashSuper = CashFactory.createSettleAccount("return 100 when 300");
		
//		CashContext cashContext = new CashContext("normal");
//		CashContext cashContext = new CashContext("rebate of 0.8");
		CashContext cashContext = new CashContext("return 100 when 300");

//		double result = cashSuper.settleAccount(total);
		double result = cashContext.getResult(total);
		
		System.out.println(result);
	}
	
	public static void calculate(Product product, Integer count) {
		double totalPrice = product.getPrice() * count;
		total += totalPrice;
	}
}
