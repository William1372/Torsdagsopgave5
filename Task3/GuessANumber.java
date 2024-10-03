import java.util.Random;
import java.util.Scanner;

public class GuessANumber{

	private static int rnd_number;

	public static void main(String[] args){

		Random random = new Random();
		rnd_number = random.nextInt(100)+1;
		System.out.println("I'm thinking of a number between 1 and 100 (including both).");
		System.out.println("Can you guess what it is?...");
		makeAGuess();

	}

	private static void makeAGuess(){

		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()){

			int guess = scanner.nextInt();

			if(guess == rnd_number){

				System.out.println("You were spot on! The number was indeed "+rnd_number+"! Well played bro!");

			}else if(guess < rnd_number){

				System.out.println("You were just a tiiiiny bit below it... Try again bro!");
				makeAGuess();

			}else if(guess > rnd_number){

				System.out.println("You were faaaaar above it bro..... Come on man... Try again!");
				makeAGuess();

			}else{


				System.out.println("Uhm... I'm asking for a NUMBER.... AN INTEGER.... Come on bro...");
				scanner.nextInt();
				makeAGuess();
			

		}


	}

}

}