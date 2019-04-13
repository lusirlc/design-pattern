package flyweight;

/**
 * 具体网站类
 * Created By Lu Chuan On 2019/4/13
 */
public class ConcreteWebsite implements Website {
	private String name = "";
	
	public ConcreteWebsite(String name) {
		this.name = name;
	}
	
	@Override
	public void use(User user) {
		System.out.println("网站分类："+this.name+"用户："+user.getName());
	}
}
