package iterator;

/**
 * Created By Lu Chuan On 2019/4/11
 */
public interface Iterator {
	Object first();
	
	Object next();
	
	boolean hasNext();
	
	Object currentItem();
}
