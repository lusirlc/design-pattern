package abstract_factory;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class AccessFactory implements Factory {
	
	
	@Override
	public User createUser() {
		return new AccessServerUser();
	}
	
	@Override
	public Department createDepartment() {
		return new AccessServerDepartment();
	}
}
