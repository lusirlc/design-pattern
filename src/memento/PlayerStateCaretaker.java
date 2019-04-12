package memento;

/**
 * Created By Lu Chuan On 2019/4/11
 */
public class PlayerStateCaretaker {
	private PlayerStateMemento playerStateMemento;
	
	public PlayerStateMemento getPlayerStateMemento() {
		return playerStateMemento;
	}
	
	public void setPlayerStateMemento(PlayerStateMemento playerStateMemento) {
		this.playerStateMemento = playerStateMemento;
	}
}
