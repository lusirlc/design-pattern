package chain_of_responsibility;

/**
 * Created By Lu Chuan On 2019/4/13
 */
public class Request {
	private String type;
	private Integer count;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Integer getCount() {
		return count;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
}
