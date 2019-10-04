package dicegame;

public class DiceWith6Faces implements Dice {
	
	@Override
	public int getRandomValue() {
		return ((int)(Math.random()*6)) + 1;
	}

}
