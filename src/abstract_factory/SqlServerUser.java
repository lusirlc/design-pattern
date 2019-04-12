package abstract_factory;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class SqlServerUser implements User{
	@Override
	public void insert() {
		System.out.println("用SqlServer插入了一条User数据");
	}
}
