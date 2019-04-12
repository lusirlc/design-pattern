package strategy;

/**
 * Created By Lu Chuan On 2019/4/4
 */
public class CashContext {
	private CashSuper cashSuper;
	
	public CashContext(String type) {
		switch (type) {
			case "normal":
				cashSuper = new CashNormal();
				break;
			case "rebate of 0.8":
				cashSuper = new CashRebate(0.8);
				break;
			case "return 100 when 300":
				cashSuper = new CashReturn(300, 100);
				break;
		}
	}
	
	public double getResult(double totalMoney) {
		return cashSuper.settleAccount(totalMoney);
	}
}
