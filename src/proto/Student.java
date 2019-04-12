package proto;

/**
 * Created By Lu Chuan On 2019/4/7
 */
public class Student implements Cloneable {
	 String name;
	 Integer age;
	 Professor p;
	
	public Student(String name, Integer age, Professor p) {
		this.name = name;
		this.age = age;
		this.p = p;
	}
	
	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", p=" + p +
				'}';
	}
	
	@Override
	public Object clone() {
		Student o = null;
		try {
			o = (Student) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.toString());
		}
		o.p = (Professor) p.clone();
		return o;
	}
}
