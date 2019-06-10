package com.sgcib.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(OrderAnnotation.class)
public class KataGameTest {
	Game game = null;
	Player nadal = null;
	Player federer = null;

	@BeforeAll
	public final void setUp() {
		System.out.println("starting test");
		// declare new game and two players
		nadal = new Player("Nadal");
		federer = new Player("Federer");
		game = new KataGame(nadal, federer);
	}

	@Test
	@Order(1)
	public void testNewGameInitScore() {
		String score = game.getScore();
		Assertions.assertEquals("Nadal 0 : 0 Federer", score);

	}

	@Test
	@Order(2)
	public void testScoreFifteen() {
		game.score(nadal);
		String score = game.getScore();
		Assertions.assertEquals("Nadal 15 : 0 Federer", score);
	}

	@Test
	@Order(3)
	public void testScoreEquality() {
		game.score(federer);
		String score = game.getScore();
		Assertions.assertEquals("Nadal 15 : 15 Federer", score);
	}

	@Test
	@Order(4)
	public void testScoreThirty() {
		game.score(nadal);
		String score = game.getScore();
		Assertions.assertEquals("Nadal 30 : 15 Federer", score);
	}

	@Test
	@Order(5)
	public void testScoreForty() {
		game.score(nadal);
		String score = game.getScore();
		Assertions.assertEquals("Nadal 40 : 15 Federer", score);
	}

	@Test
	@Order(6)
	public void testScoreAdvantage() {
		game.score(federer);
		game.score(federer);
		game.score(federer);
		String score = game.getScore();
		Assertions.assertEquals("Federer TAKES ADVANTAGE", score);
	}

	@Test
	@Order(7)
	public void testScoreDEUCE() {
		game.score(nadal);
		String score = game.getScore();
		Assertions.assertEquals("DEUCE", score);
	}

	@Test
	@Order(8)
	public void testWinner() {
		game.score(nadal);
		game.score(nadal);
		String score = game.getScore();
		Assertions.assertEquals("Nadal WINS", score);
	}

	@Test
	@Order(9)
	public void testScoreAfterWinningSet() {
		String score = game.getScore();
		Assertions.assertEquals("Nadal 0 : 0 Federer", score);
	}

}
