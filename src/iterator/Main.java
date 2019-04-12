package iterator;

/**
 * 迭代器模式：提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。
 * 当你需要访问一个聚集对象，而且不管这些对象是什么都要遍历的时候，就应该考虑迭代器模式。
 * 当你需要对聚集有多种方法遍历时，可以考虑用迭代器模式。
 * 为遍历不同的聚集结构提供如开始、下一个、是否结束、当前哪一项等统一接口
 * Created By Lu Chuan On 2019/4/11
 */
public class Main {
	public static void main(String[] args) {
		ConcreteAggregate aggregate = new ConcreteAggregate();
		aggregate.set(0,"大鸟");
		aggregate.set(1,"小菜");
		aggregate.set(2,"行李");
		aggregate.set(3,"老外");
		aggregate.set(4,"公司内部员工");
		aggregate.set(5,"小偷");
		
		Iterator iterator = new ConcreteIterator(aggregate);
		while (iterator.hasNext()) {
			System.out.println(iterator.currentItem()+"：请买车票");
			iterator.next();
		}
	}
}
