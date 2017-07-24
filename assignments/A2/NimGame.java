import java.util.Scanner;

public class NimGame {

	public static void main(String[] args) {
		nim();
	}

	/*
	 * This method is where every function of the nim game is called...
	 */
	private static void nim() {

		String player1, player2;
		int loopCondition = 0;

		// creates random numbers for the piles
		int A = (int) (Math.random() * 5 + 1), B = (int) (Math.random() * 5 + 1), C = (int) (Math
				.random() * 5 + 1);

		int[] thePile = { A, B, C };

		Scanner input = new Scanner(System.in);

		// take in names from users
		System.out.print("Player 1, enter your name: ");
		player1 = input.nextLine();

		System.out.print("Player 2, enter your name: ");
		player2 = input.nextLine();

		// Display the piles
		System.out.printf("\nA: %d\tB: %d\tC: %d\n", thePile[0], thePile[1],
				thePile[2]);

		do {
			thePile = nimgame(player1, player2, thePile);
			loopCondition = thePile[0] + thePile[1] + thePile[2];
			if (loopCondition == 0)
				break;
			thePile = nimgame(player2, player1, thePile);

			loopCondition = thePile[0] + thePile[1] + thePile[2];
		} while (loopCondition != 0);

	}

	/*
	 * This method returns the elements left 
	 * in the pile as an array of integers
	 */
	private static int[] nimgame(String currentPlayer, String nextPlayer,
			int[] thePile) {
		int remove, check = 0;
		char pile;
		int conditionToEnd;

		Scanner input = new Scanner(System.in);

		do {
			System.out.print("\n" + currentPlayer + ", choose a pile: ");

			// converts chosen pile to upper case
			pile = Character.toUpperCase(input.next().charAt(0));

			check = checkPile(pile, thePile); // the value returned is assigned
												// to check which is used to
												// test the loop

		} while (check == 0);

		System.out.printf("How many to remove from pile %c: ", pile);
		remove = input.nextInt(); // gets number of element to remove from the
									// player

		thePile = removeFromPile(pile, remove, thePile);

		System.out.printf("\nA: %d\tB: %d\tC: %d\n", thePile[0], thePile[1],
				thePile[2]);

		conditionToEnd = thePile[0] + thePile[1] + thePile[2];

		switch (conditionToEnd) {
		case 0:
			System.out.println("\n" + nextPlayer
					+ ", there are no counters left, so you WIN!");
			break;
		}
		return thePile;
	}

	/*
	 * This method returns the number of elements in the pile chosen by the
	 * player
	 */
	private static int checkPile(char pileToCheck, int[] thePile) {
		int check = 0;
		switch (pileToCheck) {
		case 'A':
			check = thePile[0];
			break;
		case 'B':
			check = thePile[1];
			break;
		case 'C':
			check = thePile[2];
			break;
		}

		return check;
	}

	/*
	 * This method removes a certain number from the pile chosen by the player
	 * The method returns the values left of the pile in an array
	 */
	private static int[] removeFromPile(char pileToRemove, int remove,
			int[] thePile) {
		switch (pileToRemove) {
		case 'A':
			thePile[0] = thePile[0] - remove;
			if (thePile[0] < 0)
				thePile[0] = 0;
			break;

		case 'B':
			thePile[1] = thePile[1] - remove;
			if (thePile[1] < 0)
				thePile[1] = 0;
			break;

		case 'C':
			thePile[2] = thePile[2] - remove;
			if (thePile[2] < 0)
				thePile[2] = 0;
			break;
		}

		return thePile;
	}

}
