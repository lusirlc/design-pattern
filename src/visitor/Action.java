package visitor;

/**
 * 反应抽象接口：相当于状态
 * Created By Lu Chuan On 2019/4/14
 */
public interface Action {
	void getManConclusion(Man concreteElementA);
	void getWomanConclusion(Woman concreteElementB);
}
