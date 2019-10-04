package dicegame;

public class DiceGame implements IDiceGame{

	private Dice dice;
	private IKeyboardInput input;
	private IDisplay display;
	
	public DiceGame(Dice dice) {
		super();
		this.dice = dice;
		this.input = new KeyboardInput();
		this.display = new Display();
	}

	@Override
	public void start() {
		do {
			playOneRound();
		} while (input.readChar() == 'y');
	}

	@Override
	public void playOneRound() {
		display.displayEntryText();
		int userChoice = input.readInt();
		int diceRollValue = getRandomDiceValue();
		display.displayDiceValue(diceRollValue);
		if (userChoice == diceRollValue)
			display.displaySuccessText();
		display.displayPlayAgainText();
	}

	@Override
	public int getRandomDiceValue() {
		return dice.getRandomValue();
	}

}
