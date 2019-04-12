package bridge;

/**
 * 合成/聚合复用原则：优先使用对象的合成/聚合有助于你保持每个类被封装，并集中在单个任务上。
 * 这样类和类的继承层次会保持较小的规模，并且不太可能增长为不可控制的庞然大物
 * 桥接模式：将抽象部分与它的实现部分分离，使它们都可以独立地变化
 *
 * Created By Lu Chuan On 2019/4/11
 */
public class Main {
	public static void main(String[] args) {
		Brand brandOfM = new BrandOfM();
		brandOfM.setSoft(new GameSoft());
		brandOfM.run();
		brandOfM.setSoft(new AddressListSoft());
		brandOfM.run();
		
		Brand brandOfN = new BrandOfN();
		brandOfN.setSoft(new GameSoft());
		brandOfN.run();
		brandOfN.setSoft(new AddressListSoft());
		brandOfN.run();
	}
}
