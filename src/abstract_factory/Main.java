package abstract_factory;

/**
 * 抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
 * Created By Lu Chuan On 2019/4/9
 */
public class Main {
	public static void main(String[] args) {
//		Factory factory = new AccessFactory();
		Factory factory = new SqlServerFactory();
		Department department = factory.createDepartment();
		User user = factory.createUser();
		department.insert();
		user.insert();
		
	}
}
