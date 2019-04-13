package flyweight;

/**
 * 享元模式：运用共享技术有效地支持大量细粒度的对象
 * Created By Lu Chuan On 2019/4/13
 */
public class Main {
	public static void main(String[] args) {
		WebsiteFactory factory = new WebsiteFactory();
		Website fx = factory.getWebsiteCategory("产品展示");
		fx.use(new User("小菜"));
		
		Website fy = factory.getWebsiteCategory("产品展示");
		fy.use(new User("大鸟"));
		
		Website fz = factory.getWebsiteCategory("产品展示");
		fz.use(new User("娇娇"));
		
		Website fl = factory.getWebsiteCategory("博客");
		fl.use(new User("李白"));
		
		Website fm = factory.getWebsiteCategory("博客");
		fm.use(new User("杜甫"));
		
		Website fn = factory.getWebsiteCategory("博客");
		fn.use(new User("陶渊明"));
		
		System.out.println("网站分类总数："+factory.getWebsiteCount());
	}
}
