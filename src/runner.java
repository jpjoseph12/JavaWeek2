import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class runner {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Rock = 0, Paper = 1 or Scissors = 2, Quit = 3");

		int rpsInput = s.nextInt();

		Random rand = new Random();
		double crps = rand.nextInt(2);
		double playerCount = 0;
		double cpuPlayercount = 0;
		double count = 0;
		double drawCount = 0;

		while (rpsInput != 3) {
			if (rpsInput == 0 || rpsInput == 1 || rpsInput == 2 || rpsInput == 3) {

				if (crps == rpsInput) {
					System.out.println("It's a draw, nobody wins :(");
					drawCount++;
					count++;
				} else if ((crps == 0 && rpsInput == 1) || (crps == 1 && rpsInput == 2)
						|| (crps == 2 && rpsInput == 0)) {

					System.out.println("Congratulations, you win!");
					count++;
					playerCount++;
				} else {

					System.out.println("Sorry you lose!");
					count++;
					cpuPlayercount++;
				}

				System.out.println("Woukd you like to play again? Rock = 0, Paper = 1 or Scissors = 2, Quit = 3");

				rpsInput = s.nextInt();

				crps = rand.nextInt(2);
			} else {
				System.out.println("Invalid input try again!");

				System.out.println("Rock = 0, Paper = 1 or Scissors = 2, Quit = 3");

				rpsInput = s.nextInt();

				crps = rand.nextInt(2);
			}

		}
		
		double pcWinPercentage = (cpuPlayercount/count)*100;
		double pplayerWinPercentage = (playerCount/count)*100;
		double drawPercentage = (drawCount/count)*100;
		
		System.out.println("\n\nYou won " + playerCount + " times." + "(" + pplayerWinPercentage + "% Win rate)" + 
		"\nThe computer won " + cpuPlayercount + " times." + "("+ pcWinPercentage +"% Lose rate)" +
				"\nYou drew a total of " + drawCount + " times." + "(" + drawPercentage + "% Draw rate)"
				+ "\nYou played a total of " + count + " games this session.");

	}

}
