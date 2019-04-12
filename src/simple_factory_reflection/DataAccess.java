package simple_factory_reflection;

import abstract_factory.Department;
import abstract_factory.User;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class DataAccess {
	private static final String DATABASE = "SqlServer";
	
	//	public User createUser() {
//		switch (DATABASE) {
//			case "SqlServer":
//				return new SqlServerUser();
//			case "AccessServer":
//				return new AccessServerUser();
//		}
//		return null;
//	}
//
//	public Department createDepartment() {
//		switch (DATABASE) {
//			case "SqlServer":
//				return new SqlServerDepartment();
//			case "AccessServer":
//				return new AccessServerDepartment();
//		}
//		return null;
//	}
	public User createUser() {
		User user = null;
		try {
			Class<?> clazz = Class.forName("abstract_factory."+DATABASE + "User");
			user = (User) clazz.newInstance();
		} catch (Exception e) {
			return null;
		}
		return user;
	}
	
	public Department createDepartment(){
		Department department = null;
		try {
			Class<?> clazz = Class.forName("abstract_factory."+DATABASE + "Department");
			department = (Department) clazz.newInstance();
		} catch (Exception e) {
			return null;
		}
		return department;
	}
}
