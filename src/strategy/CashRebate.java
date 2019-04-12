package strategy;

/**
 * Created By Lu Chuan On 2019/4/4
 */
public class CashRebate extends CashSuper {
	private double moneyRebate;
	
	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}
	
	
	@Override
	public double settleAccount(double totalMoney) {
		return totalMoney * moneyRebate;
	}
}
