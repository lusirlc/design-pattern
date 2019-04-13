package flyweight;

import java.util.Hashtable;

/**
 * 网站工厂类
 * Created By Lu Chuan On 2019/4/13
 */
public class WebsiteFactory {
	private Hashtable flyweights = new Hashtable();
	
	public Website getWebsiteCategory(String key) {
		if (!flyweights.contains(key)) {
			flyweights.put(key, new ConcreteWebsite(key));
		}
		return (Website) flyweights.get(key);
	}
	
	public Integer getWebsiteCount(){
		return flyweights.size();
	}
}
