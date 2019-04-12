package builder;

/**
 * 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * Created By Lu Chuan On 2019/4/7
 */
public class Main {
	public static void main(String[] args) {
		PersonThinBuilder personThinBuilder = new PersonThinBuilder();
		PersonDirector thinDirector = new PersonDirector(personThinBuilder);
		thinDirector.createPerson();
		
		PersonFatBuilder personFatBuilder = new PersonFatBuilder();
		PersonDirector fatDirector = new PersonDirector(personFatBuilder);
		fatDirector.createPerson();
	}
}
