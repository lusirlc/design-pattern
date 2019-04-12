package simple_factory_reflection;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class Main {
	public static void main(String[] args) {
//		DataAccess dataAccess = new DataAccess();
//		Department department = dataAccess.createDepartment();
//		User user = dataAccess.createUser();
//		department.insert();
//		user.insert();
		Main main = new Main();
		main.test();
	}
	
	public void test(){
//		String path = this.getClass().getClassLoader().getSystemResource(".").getPath();
//		String path1 = this.getClass().getClassLoader().getSystemResource(".").getFile();
		String path = this.getClass().getPackage().getName();
		
		System.out.println(path);
	}
}
