package mediator;

/**
 * Created By Lu Chuan On 2019/4/13
 */
public class UnitedNationsSecurityCouncil implements UnitedNations {
	private USA usa;
	private IRAQ iraq;
	
	public void setUsa(USA usa) {
		this.usa = usa;
	}
	
	public void setIraq(IRAQ iraq) {
		this.iraq = iraq;
	}
	
	@Override
	public void declare(String message, Country country) {
		if (country == usa) {
			iraq.getMessage(message);
		} else if (country == iraq) {
			usa.getMessage(message);
		}
	}
}
