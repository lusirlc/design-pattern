package strategy;

/**
 * Created By Lu Chuan On 2019/4/4
 */
public class CashNormal extends CashSuper {
	
	@Override
	public double settleAccount(double totalMoney) {
		return totalMoney;
	}
}
