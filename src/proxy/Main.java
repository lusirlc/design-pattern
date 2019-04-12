package proxy;


/**
 * Created By Lu Chuan On 2019/4/6
 */
public class Main {
	public static void main(String[] args) {
		SchoolGirl jiaojiao = new SchoolGirl("jiaojiao");
		Proxy daili = new Proxy(jiaojiao);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
	
}
