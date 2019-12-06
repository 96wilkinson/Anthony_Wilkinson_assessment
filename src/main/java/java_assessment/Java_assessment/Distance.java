package java_assessment.Java_assessment;

public class Distance extends Rndnumbers{
	Messages exitWest = new Messages();
	Messages exitEast = new Messages();
	Messages exitNorth = new Messages();
	Messages exitSouth = new Messages();
	public void getDistance() {
		if (exitX > playerX) {
			exitWest.ebiggerpx();
		} else {
			exitEast.pbiggerex();
		}

		if (exitY > playerY) {
			exitNorth.ebiggerpy();
		} else {
			exitSouth.pbiggerey();
		}
	}
		
}
