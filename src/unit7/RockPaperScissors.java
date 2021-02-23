package unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors {
	private String playChoice;
	private String compChoice;

	public RockPaperScissors() {

		setPlayers("");

	}

	public RockPaperScissors(String player) {
		setPlayers(player);
	}

	public void setPlayers(String player) {
		playChoice = player;

		int num = (int) (3 * Math.random());

		switch (num) {
			case 0:
				compChoice = "R";
				break;
			case 1:
				compChoice = "P";
				break;
			case 2:
				compChoice = "S";
				break;
		}

	}

	public String determineWinner() {
		String winner = "";

		// out.print("one " + playChoice);
		if (playChoice.equalsIgnoreCase(compChoice)) {
			out.println("You tied! Play again?");
			winner = "You tied! Play again?";
		}

		else if (playChoice.equalsIgnoreCase("R")) {
			switch (compChoice) {
				case "P":
					out.println("You lose! Paper covers rock.");
					winner = "You lose! Paper covers rock.";
					break;
				case "S":
					out.println("You win! Rock breacks scissors.");
					winner = "You win! Rock breacks scissors.";
					break;
			}
		}

		else if (playChoice.equalsIgnoreCase("p")) {
			switch (compChoice) {
				case "R":
					out.println("You win! Paper covers rock.");
					winner = "You win! Paper covers rock.";
					break;
				case "S":
					out.println("You lose! Scissors cuts paper");
					winner = "You lose! Scissors cuts paper.";
					break;
			}
		}

		else if (playChoice.equalsIgnoreCase("S")) {
			switch (compChoice) {
				case "R":
					out.println("You lose! Rock breaks scissors.");
					winner = "You lose! Rock breaks scissors.";
					break;
				case "P":
					out.println("You win! Scissors cut paper.");
					winner = "You win! Scissors cut paper.";
					break;
			}
		} else {
			out.println("fail");
		}


		return winner;
	}

	public String toString() {
        return determineWinner();
	}
}