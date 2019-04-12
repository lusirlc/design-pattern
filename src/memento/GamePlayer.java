package memento;

/**
 * Created By Lu Chuan On 2019/4/9
 */
public class GamePlayer {
	// 生命力
	private int vit;
	// 攻击力
	private int atk;
	// 防御力
	private int def;
	
	// 保存状态
	public PlayerStateMemento saveState() {
		return new PlayerStateMemento(this.vit, this.atk, this.def);
	}
	// 还原状态
	public void recoveryState(PlayerStateMemento stateMemento){
		this.vit = stateMemento.getVit();
		this.atk = stateMemento.getAtk();
		this.def = stateMemento.getDef();
	}
	
	public GamePlayer() {
	}
	
	public GamePlayer(int vit, int atk, int def) {
		this.vit = vit;
		this.atk = atk;
		this.def = def;
	}
	
	public int getVit() {
		return vit;
	}
	
	public void setVit(int vit) {
		this.vit = vit;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public int getDef() {
		return def;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
	
	public void showState() {
		System.out.println("生命力："+this.vit);
		System.out.println("攻击力："+this.atk);
		System.out.println("防御力："+this.def);
	}
	
	public void initState() {
		this.vit=100;
		this.atk=100;
		this.def=100;
	}
	
	public void fight() {
		this.vit-=10;
		this.atk-=5;
		this.def-=6;
	}
}
