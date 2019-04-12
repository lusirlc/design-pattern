package strategy;

/**
 * Created By Lu Chuan On 2019/4/4
 */
public class CashReturn extends CashSuper {
	private double moneyCondition;
	private double moneyReturn;
	
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	
	@Override
	public double settleAccount(double totalMoney) {
		if (totalMoney > moneyCondition) {
			return totalMoney - moneyReturn;
		}
		return totalMoney;
	}
}
