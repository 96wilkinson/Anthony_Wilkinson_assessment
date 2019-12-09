package com.bae.swamp.game;

import java.util.Random;
import java.util.Scanner;

import com.bae.swamp.entities.Entity;
import com.bae.swamp.utils.Direction;
import com.bae.swamp.utils.DirectionFactory;
import com.bae.swamp.utils.Messages;

public class Game {

	private int size;

	private Random rand = new Random();

	private Entity exit;

	private Entity player;

	private Scanner scanner;

	public Game() {
		this(10);
	}

	public Game(int size) {
		this.size = Math.max(size, 5);
		exit = new Entity(rand, this.size);
		player = new Entity(rand, this.size);
	}

	private int getDistance() {
		return (int) Math
				.ceil(Math.hypot(this.player.getX() - this.exit.getX(), this.player.getY() - this.exit.getY()));
	}

	private int getPaces(Direction dir) {
		Messages.howManyPaces(dir);
		int paces = 0;
		do {
			try {
				String _paces = this.scanner.nextLine();
				paces = Integer.parseInt(_paces);
			} catch (NumberFormatException nfe) {
				Messages.askForNumber();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (paces == 0);
		return paces;
	}

	private void move(Direction dir, int paces) {
		switch (dir) {
		case NORTH:
			this.player.setY(this.player.getY() - paces);
			return;
		case EAST:
			this.player.setX(this.player.getX() - paces);
			return;
		case SOUTH:
			this.player.setY(this.player.getY() + paces);
			return;
		case WEST:
			this.player.setX(this.player.getX() + paces);
			return;
		default:
			return;
		}
	}

	public void play() {
		scanner = new Scanner(System.in);
		Messages.displayIntro();
		while (this.getDistance() == 0) {
			this.player = new Entity(rand, size);
		}
		do {
			Messages.showDistance(getDistance());
			Direction dir = DirectionFactory.getInstance().getDirection(this.scanner.nextLine().toLowerCase());
			int paces = getPaces(dir);
			move(dir, paces);
		} while (this.getDistance() != 0);
		Messages.win();
		scanner.close();
	}

}
