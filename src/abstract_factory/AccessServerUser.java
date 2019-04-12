package abstract_factory;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class AccessServerUser implements User{
	@Override
	public void insert() {
		System.out.println("用AccessServer插入了一条User数据");
	}
}
