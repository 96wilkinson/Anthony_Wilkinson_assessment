package com.bae.swamp.utils;

public class Messages /* */ {

	public static void displayIntro() {
		System.out.println("Grey foggy clouds float oppressively close to you, \r\n"
				+ "reflected in the murky grey water which reaches up your shins.\r\n"
				+ "Some black plants barely poke out of the shallow water.\r\n"
				+ "Try \"north\", \"south\", \"east\", or \"west\"\r\n"
				+ "You notice a small watch-like device in your left hand.  \r\n"
				+ "It has hands like a watch, but the hands don't seem to tell time.\r\n" + "");
	}

	public static void showDistance(int dist) {
		System.out.println("The player is around " + dist + " paces from the exit!");
	}

	public static void howManyPaces(Direction dir) {
		System.out.println("How many paces " + dir + " would you like to take?");
	}

	public static void win() {
		System.out.println("You see a box sitting on the plain. It’s filled with treasure! You win, for now.....");
		System.out.println("#evil laughter is heard in the distance");
	}
	
	public static void askForNumber() {
		System.out.println("Please enter a number!");
	}
}
