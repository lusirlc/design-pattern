package abstract_factory;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class SqlServerDepartment implements Department{
	@Override
	public void insert() {
		System.out.println("用SqlServer插入了一条Department数据");
	}
}
