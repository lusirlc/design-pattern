package proto;

/**
 * Created By Lu Chuan On 2019/4/6
 */
public class Main {
	public static void main(String[] args) {
		Professor professor = new Professor("wangwu", 50);
		Student s1 = new Student("zhangsan", 18, professor);
		Student s2 = (Student) s1.clone();
		s2.p.name = "lisi";
		s2.p.age = 30;
		System.out.println(s1);
		System.out.println(s2);
	}
}
