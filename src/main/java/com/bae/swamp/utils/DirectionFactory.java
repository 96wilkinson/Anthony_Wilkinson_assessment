package com.bae.swamp.utils;

public class DirectionFactory {

	private DirectionFactory() {

	}

	public static final DirectionFactory getInstance() {
		if (instance == null) {
			instance = new DirectionFactory();
		}
		return instance;
	}

	private static DirectionFactory instance;

	public Direction getDirection(String direction) {
		switch (direction) {
		case "n":
		case "north":
			return Direction.NORTH;
		case "e":
		case "east":
			return Direction.EAST;
		case "s":
		case "south":
			return Direction.SOUTH;
		case "w":
		case "west":
			return Direction.WEST;
		default:
			return null;
		}
	}

}
