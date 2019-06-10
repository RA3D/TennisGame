package com.sgcib.core;

/**
 * Player bean.
 * 
 * @author zakariae
 * 
 */
public class Player {

	private String name;
	private int score;

	public Player(String name) {
		super();
		this.name = name;
		this.score = 0;

	}

	public int getScore() {
		return score;
	}

	void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	void score() {
		this.score++;
	}

}