package proxy;

/**
 * Created By Lu Chuan On 2019/4/6
 */
public class Proxy implements GiveGift {
	Pursuit gg;
	
	public Proxy(SchoolGirl mm) {
		gg = new Pursuit(mm);
	}
	
	@Override
	public void giveDolls() {
		gg.giveDolls();
	}
	
	@Override
	public void giveFlowers() {
		gg.giveFlowers();
	}
	
	@Override
	public void giveChocolate() {
		gg.giveChocolate();
	}
}
