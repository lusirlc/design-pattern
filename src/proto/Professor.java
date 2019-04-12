package proto;

/**
 * Created By Lu Chuan On 2019/4/7
 */
public class Professor implements Cloneable{
	String name;
	Integer age;
	
	
	public Professor(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Professor{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
	
	@Override
	public Object clone() {
		Object o = null;
		
		try {
			o = (Professor) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
}
