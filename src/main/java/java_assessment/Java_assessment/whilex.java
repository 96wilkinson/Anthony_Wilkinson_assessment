package java_assessment.Java_assessment;

import java.util.Scanner;

public class whilex extends Rndnumbers {
	Messages exitWest = new Messages();
	Messages distanceMessage = new Messages();
	Messages exitEast = new Messages();
	Messages exitNorth = new Messages();
	Messages exitSouth = new Messages();
	Distance distmeasure = new Distance();
	Messages westOrEast = new Messages();
	Messages pacesEast = new Messages();
	Messages pacesWest = new Messages();
	static Scanner a1 = new Scanner(System.in);
	static Scanner s1 = new Scanner(System.in);

	public void getMovementX() {
		while (exitX != playerX && exitY != playerY) {

			distanceMessage.getDist();
			distmeasure.getDistance();
			while (exitX != playerX) {
				westOrEast.moveeastorwest();
				while (!answer1.equals("west") && !answer1.equals("east")) {
					answer1 = a1.next();
					answer1 = answer1.toLowerCase();
					if (!answer1.equals("west") && !answer1.equals("east")) {
						westOrEast.moveeastorwest();
					}
				}
				if (answer1.contentEquals("east") || answer1.contentEquals("west")) {

					if (answer1.contentEquals("east")) {
						pacesEast.howmanypaceseast();
						x = s1.nextInt();
					} else {
						pacesWest.howmanypaceswest();
						x = s1.nextInt();
						x = x * -1;
					}
					playerX = playerX + x;
					if (exitX > playerX) {
						exitWest.ebiggerpx();
					} else {
						exitEast.pbiggerex();
					}
				}

			}

		}
	}
}
