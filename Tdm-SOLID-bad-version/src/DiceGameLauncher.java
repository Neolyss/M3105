import dicegame.DiceGame;
import dicegame.DiceWith6Faces;
import dicegame.IDiceGame;

public class DiceGameLauncher {

	public static void main(String[] args) {
		IDiceGame game = new DiceGame(new DiceWith6Faces()); 
		game.start();
	}

}
