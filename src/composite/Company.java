package composite;

/**
 * Created By Lu Chuan On 2019/4/11
 */
public abstract class Company {
	protected String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	public abstract void add(Company company);
	
	public abstract void remove(Company company);
	
	public abstract void show(int dept);
	
	// 履行职责
	public abstract void lineOfDuty();
	
	public StringBuilder getDept(int dept) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < dept; i++) {
			sb.append("-");
		}
		return sb;
	}
}
