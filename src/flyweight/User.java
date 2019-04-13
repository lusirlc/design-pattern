package flyweight;

/**
 * 用户类
 * Created By Lu Chuan On 2019/4/13
 */
public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
