package strategy;

/**
 * Created By Lu Chuan On 2019/4/4
 */
public class CashFactory {
	public static CashSuper createSettleAccount(String type) {
		switch (type) {
			case "normal":
				return new CashNormal();
			case "rebate of 0.8":
				return new CashRebate(0.8);
			case "return 100 when 300":
				return new CashReturn(300, 100);
		}
		return null;
	}
}
