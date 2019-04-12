package decorator;

/**
 * Created By Lu Chuan On 2019/4/5
 */
public  class Person {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void show() {
		System.out.println("装扮的"+this.name);
	}
	
}
