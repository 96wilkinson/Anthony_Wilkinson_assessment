package java_assessment.Java_assessment;

import java.util.Random;

public class Rndnumbers {

	static Random rand1 = new Random();
	static Random rand2 = new Random();
	static Random rand3 = new Random();
	static Random rand4 = new Random();

	static int x = 0;
	static int y = 0;
	
	static String answer1 ="";
	static String answer2 ="";

	static int exitX = rand1.nextInt(10);
	static int exitY = rand2.nextInt(10);

	static int playerX = rand3.nextInt(10);
	static int playerY = rand4.nextInt(10);

}
