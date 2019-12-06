package java_assessment.Java_assessment;

import java.util.Scanner;

public class Gamelogic extends Rndnumbers {

	static Scanner a1 = new Scanner(System.in);
	static Scanner a2 = new Scanner(System.in);
	static Scanner s1 = new Scanner(System.in);
	static Scanner s2 = new Scanner(System.in);

	public void getGameLogic() {

		whilex x = new whilex();
		whiley y = new whiley();
		Messages win = new Messages();

		if (exitX != playerX && exitY != playerY) {
			x.getMovementX();
			y.getMovementy();

		}
		if (exitX == playerX && exitY == playerY) {
			{
				win.win();
			}
			s1.close();
			s2.close();
			a1.close();
			a2.close();
		}
	}

}
