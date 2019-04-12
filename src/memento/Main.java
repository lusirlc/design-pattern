package memento;

/**
 * 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，
 * 并在该对象之外保存这个状态，这样以后就可将该对象恢复到原先的保存状态。
 * Memento模式比较适合用于功能比较复杂，但需要维护或记录属性历史的类，
 * 或者需要保存的属性只是众多属性的一小部分时，Originator可以根据保存的Memento信息还原到前一状态
 * Created By Lu Chuan On 2019/4/9
 */
public class Main {
	public static void main(String[] args) {
		// 游戏开始，初始化角色状态
		GamePlayer gamePlayer = new GamePlayer();
		gamePlayer.initState();
		gamePlayer.showState();
		// 开始打怪
		gamePlayer.fight();
		gamePlayer.showState();
		
		// 存档
		PlayerStateMemento memento = gamePlayer.saveState();
		// 继续打怪
		gamePlayer.fight();
		gamePlayer.showState();
		
		// 读取存档
		gamePlayer.recoveryState(memento);
		gamePlayer.showState();
	}
}
