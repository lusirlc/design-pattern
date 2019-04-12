package composite;
import java.util.ArrayList;
import java.util.List;
/**
 * Created By Lu Chuan On 2019/4/11
 */
public class ConcreteCompany extends Company {
	private List<Company> companyList = new ArrayList<>();
	public ConcreteCompany(String name) {
		super(name);
	}
	
	@Override
	public void add(Company company) {
		this.companyList.add(company);
	}
	
	@Override
	public void remove(Company company) {
		this.companyList.remove(company);
	}
	
	@Override
	public void show(int dept) {
		StringBuilder sb = getDept(dept);
		System.out.println(sb.toString()+this.name);
		for (Company company : this.companyList) {
			company.show(dept+1);
		}
	}
	
	
	
	@Override
	public void lineOfDuty() {
		for (Company company : companyList) {
			company.lineOfDuty();
		}
	}
}
