package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Lu Chuan On 2019/4/14
 */
public class ObjectStructure {
	private List<Person> elements = new ArrayList<>();
	
	// 增加
	public void add(Person element) {
		elements.add(element);
	}
	
	// 移除
	public void remove(Person element) {
		elements.remove(element);
	}
	
	// 查看显示
	public void show(Action visitor) {
		for (Person person : elements) {
			person.accept(visitor);
		}
	}
}
