package abstract_factory;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class AccessServerDepartment implements Department{
	@Override
	public void insert() {
		System.out.println("用AccessServer插入了Department一条数据");
	}
}
