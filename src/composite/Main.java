package composite;

/**
 * 将对象组合成树形结构以表示“部分-整体”的层次结构
 * 组合模式使得用户对单个对象和组合对象的使用具有一致性
 * 当发现需求中是体现部分于整体层次的结构时，以及你希望
 * 用户可以忽略组合对象与单个对象的不同，统一使用组合结构中的所有对象时，就应该考虑使用组合模式
 * Created By Lu Chuan On 2019/4/11
 */
public class Main {
	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司财务部"));
		
		ConcreteCompany companyPart1 = new ConcreteCompany("华东分公司");
		companyPart1.add(new HRDepartment("华东分公司人力资源部"));
		companyPart1.add(new FinanceDepartment("华东分公司财务部"));
		root.add(companyPart1);
		
		ConcreteCompany companyPart2 = new ConcreteCompany("上海办事处");
		companyPart2.add(new HRDepartment("上海人力资源部"));
		companyPart2.add(new FinanceDepartment("上海财务部"));
		companyPart1.add(companyPart2);
		
		ConcreteCompany companyPart3 = new ConcreteCompany("杭州办事处");
		companyPart3.add(new HRDepartment("杭州人力资源部"));
		companyPart3.add(new FinanceDepartment("杭州财务部"));
		companyPart1.add(companyPart3);
		
		root.show(1);
		root.lineOfDuty();
	}
}
