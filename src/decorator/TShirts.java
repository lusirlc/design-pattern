package decorator;

/**
 * Created By Lu Chuan On 2019/4/5
 */
public class TShirts extends Finery {
	@Override
	public void show() {
		System.out.println("大T恤");
		super.show();
	}
}
