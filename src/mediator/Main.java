package mediator;

/**
 * 中介者模式：用一个中介对象来封装一系列的对象交互，
 * 中介者使各对象不需要显示地相互引用，从而使其耦合松散，而且可以独立改变它们之间的交互.
 * 中介者模式一般用于一组对象已定义良好但是复杂的方式进行通信的场合
 * Created By Lu Chuan On 2019/4/13
 */
public class Main {
	public static void main(String[] args) {
		UnitedNationsSecurityCouncil securityCouncil = new UnitedNationsSecurityCouncil();
		USA usa = new USA(securityCouncil);
		IRAQ iraq = new IRAQ(securityCouncil);
		securityCouncil.setIraq(iraq);
		securityCouncil.setUsa(usa);
		usa.declare("不准研制核武器，否则发动战争");
		iraq.declare("我们没有核武器，也不怕战争");
	}
}
