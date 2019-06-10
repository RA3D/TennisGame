package com.sgcib.core;

/**
 * 
 * @author Zakariae
 *
 */
public class KataGame implements Game {

	private Player player1;
	private Player player2;

	public KataGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	/* (non-Javadoc)
	 * @see com.sgcib.entities.Game#getScore()
	 */
	public String getScore() {
		String result = "";
		//If the 2 players reach the score 40 (3 points), the DEUCE rule is activated
		if (player1.getScore() > 3 || player2.getScore() > 3) {
			//If the score is DEUCE , the player who wins the point takes the ADVANTAGE
			if (player1.getScore() == player2.getScore() + 1) {
				result = player1.getName() + " TAKES ADVANTAGE";
			} else if (player2.getScore() == player1.getScore() + 1) {
				result = player2.getName() + " TAKES ADVANTAGE";
			}
			//If the player who has the ADVANTAGE wins the point, he wins the game
			else if (player1.getScore() >= player2.getScore() + 2) {
				result = player1.getName() + " WINS";
				resetScore();
			} else if (player2.getScore() >= player1.getScore() + 2) {
				result = player2.getName() + " WINS";
				resetScore();
		  
			}  else if (player1.getScore() == player2.getScore()) {
				result = "DEUCE";
			}

		} else {
			result = player1.getName() + " " + translateScore(player1.getScore()) + " : "
					+ translateScore(player2.getScore()) + " " + player2.getName();
		}

		return result;

	}

	/* (non-Javadoc)
	 * @see com.sgcib.entities.Game#score(com.sgcib.entities.Player)
	 */
	public void score(Player player) {
		//score new point
		player.score();
		//display results
		System.out.println(getScore());
	}

	/**
	 * translate players score to tennis score 0>15>30>40.
	 * 
	 * @param score
	 * @return
	 */
	private String translateScore(int score) {
		switch (score) {
		case 3:
			return "40";
		case 2:
			return "30";
		case 1:
			return "15";
		case 0:
			return "0";
		}
		throw new IllegalArgumentException("Illegal score: " + score);
	}
	
	/**
	 * reset players score after winning a set.
	 * 
	 */
	private void resetScore() {
		player1.setScore(0);
		player2.setScore(0);
	}

}