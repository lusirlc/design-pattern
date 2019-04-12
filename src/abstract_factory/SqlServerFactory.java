package abstract_factory;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class SqlServerFactory implements Factory {
	
	@Override
	public User createUser() {
		return new SqlServerUser();
	}
	
	@Override
	public Department createDepartment() {
		return new SqlServerDepartment();
	}
}
