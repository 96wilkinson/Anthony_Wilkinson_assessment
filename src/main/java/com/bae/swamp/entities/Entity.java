package com.bae.swamp.entities;

import java.util.Random;

public class Entity {

	private int x;
	private int y;

	public Entity(Random rand, int gameSize) {
		this.setX(rand.nextInt(gameSize) - (gameSize/2));
		this.setY(rand.nextInt(gameSize) - (gameSize/2));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
