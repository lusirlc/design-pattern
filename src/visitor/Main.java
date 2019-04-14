package visitor;

/**
 * 访问者模式：表示作用于某对象结构中的各元素操作，
 * 它可以使你在不改变各元素的类的前提下定义作用于这些元素的新操作。
 * Created By Lu Chuan On 2019/4/14
 */
public class Main {
	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new Man());
		objectStructure.add(new Woman());
		
		// 成功时的反应
		Success success = new Success();
		objectStructure.show(success);
		
		// 失败时的反应
		Failing failing = new Failing();
		objectStructure.show(failing);
	}
}
