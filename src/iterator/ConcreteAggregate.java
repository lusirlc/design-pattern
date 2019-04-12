package iterator;

import java.util.ArrayList;
import java.util.List;
/**
 * Created By Lu Chuan On 2019/4/11
 */
public class ConcreteAggregate implements Aggregate {
	private List<Object> objectList = new ArrayList<>();
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	public int size(){
		return this.objectList.size();
	}
	
	public Object get(int index) {
		return this.objectList.get(index);
	}
	
	public void set(int index, Object value) {
		this.objectList.add(index, value);
	}
}
