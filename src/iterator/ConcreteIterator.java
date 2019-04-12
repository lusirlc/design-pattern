package iterator;

/**
 * Created By Lu Chuan On 2019/4/11
 */
public class ConcreteIterator implements Iterator {
	private ConcreteAggregate concreteAggregate;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate concreteAggregate) {
		this.concreteAggregate = concreteAggregate;
	}
	
	@Override
	public Object first() {
		return this.concreteAggregate.get(0);
	}
	
	@Override
	public Object next() {
		Object ret = null;
		this.current++;
		if (this.current < concreteAggregate.size()) {
			ret = this.concreteAggregate.get(this.current);
		}
		return ret;
	}
	
	@Override
	public boolean hasNext() {
		return this.current < this.concreteAggregate.size() ? true : false;
	}
	
	@Override
	public Object currentItem() {
		return this.concreteAggregate.get(current);
	}
}
