package decorator;

/**
 * Created By Lu Chuan On 2019/4/5
 */
public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("小艾");
		BigTrouser bigTrouser = new BigTrouser();
		TShirts tShirts = new TShirts();
		bigTrouser.decorator(person);
		tShirts.decorator(bigTrouser);
		tShirts.show();
	}
}
