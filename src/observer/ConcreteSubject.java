package observer;

/**
 * Created By Lu Chuan On 2019/4/7
 */
public class ConcreteSubject extends Subject {
	private String subjectState;
	
	public String getSubjectState() {
		return subjectState;
	}
	
	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
}
