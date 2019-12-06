package java_assessment.Java_assessment;

import java.util.Scanner;

public class whiley extends Rndnumbers{
	Messages exitNorth = new Messages();
	Messages exitSouth = new Messages();
	Messages northOrSouth = new Messages();
	Messages pacesNorth = new Messages();
	Messages pacesSouth = new Messages();
	Messages win = new Messages();
	static Scanner a2 = new Scanner(System.in);
	static Scanner s2 = new Scanner(System.in);
	public void getMovementy() {
		while (exitY != playerY) {
			northOrSouth.movenorthorsouth();
			while (!answer2.contentEquals("north") && !answer2.contentEquals("south")) {
				answer2 = a2.next();
				answer2 = answer2.toLowerCase();
				if (!answer2.contentEquals("north") || !answer2.contentEquals("south")) {
					northOrSouth.movenorthorsouth();
				}
			}
			if (answer2.contentEquals("north")) {
				pacesNorth.howmanypacesnorth();
				y = s2.nextInt();
			} else {
				pacesSouth.howmanypacesSouth();
				y = s2.nextInt();
				y = y * -1;
			}
			playerY = playerY + y;
			if (exitY > playerY) {
				exitNorth.ebiggerpy();
			} else {
				exitSouth.pbiggerey();
			}
		}
	}

}
