package dicegame;

import java.util.Scanner;

public class KeyboardInput implements IKeyboardInput {

	private Scanner reader = new Scanner(System.in);
	
	public char readChar() {
		return (char) reader.next().charAt(0);
	}

	public int readInt() {
		return reader.nextInt();
	}

}
