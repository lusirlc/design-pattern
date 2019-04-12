package template;

/**
 * Created By Lu Chuan On 2019/4/7
 */
public abstract class TestPaper {
	public void question1(){
		System.out.println("question1"+answer1());
	}
	
	public void question2(){
		System.out.println("question2"+answer2());
	}
	public void question3(){
		System.out.println("question3"+answer3());
	}
	public abstract String answer1();
	public abstract String answer2();
	public abstract String answer3();
}
