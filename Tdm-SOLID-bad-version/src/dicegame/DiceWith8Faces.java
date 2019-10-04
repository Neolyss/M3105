package dicegame;

public class DiceWith8Faces implements Dice {

	@Override
	public int getRandomValue() {
		return ((int)(Math.random()*8)) + 1;
	}

}
