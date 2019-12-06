package java_assessment.Java_assessment;

public class Messages extends Rndnumbers{
	public void getIntro () {
		System.out.println("Grey foggy clouds float oppressively close to you, \r\n"
				+ "reflected in the murky grey water which reaches up your shins.\r\n"
				+ "Some black plants barely poke out of the shallow water.\r\n"
				+ "Try \"north\", \"south\", \"east\", or \"west\"\r\n"
				+ "You notice a small watch-like device in your left hand.  \r\n"
				+ "It has hands like a watch, but the hands don't seem to tell time.\r\n" + "");
	}
	
	public void getDist() {
		System.out.println(
				"The player is around " + (Math.round(Math.hypot((exitX - playerX), (exitY - playerY))) + " paces from the exit!"));
	}
	
	public void ebiggerpx() {
		System.out.println("The exit is East by  " + (exitX - playerX) + " Paces");
	}
	public void pbiggerex() {
		System.out.println("The exit is West by " + (playerX - exitX) + " Paces");
	}
	public void ebiggerpy() {
		System.out.println("The exit is North by " + (exitY - playerY) + " Paces");
	}
	public void pbiggerey() {
		System.out.println("The exit is South by " + (playerY - exitY) + " Paces");
	}
	public void moveeastorwest() {
		System.out.println("Would you like to move East or West?");
	}
	public void howmanypaceseast() {
		System.out.println("How many paces East would you like to take?");
	}
	public void howmanypaceswest() {
		System.out.println("How many paces West would you like to take?");
	}
	public void movenorthorsouth() {
		System.out.println("Would you like to move North or South?");
	}
	public void howmanypacesnorth() {
		System.out.println("How many paces North would you like to take?");
	}
	public void howmanypacesSouth() {
		System.out.println("How many paces South would you like to take?");
	}
	public void win() {
		System.out.println("You see a box sitting on the plain. It’s filled with treasure! You win, for now.....");
		System.out.println("#evil laughter is heard in the distance");
	}
}
