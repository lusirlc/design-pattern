package composite;

/**
 * Created By Lu Chuan On 2019/4/11
 */
public class HRDepartment extends Company {
	public HRDepartment(String name) {
		super(name);
	}
	
	@Override
	public void add(Company company) {
	
	}
	
	@Override
	public void remove(Company company) {
	
	}
	
	@Override
	public void show(int dept) {
		StringBuilder sb = getDept(dept);
		System.out.println(sb.toString() + this.name);
	}
	
	@Override
	public void lineOfDuty() {
		System.out.println(this.name+"：员工招聘");
	}
}
