package lwinoo;
import java.util.Random;
import java.util.Scanner;
public class Level3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;

		Random rand = new Random();
		int randNum = rand.nextInt(20);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers between 0 and 20 ");
		System.out.print("Guess numbers : ");
		int guessNum = scan.nextInt();

		while (randNum != guessNum) {
			if (guessNum < 0 || guessNum > 20) {
				System.out.println("guess the number between 0 and 20");
				System.out.print("Guess again : ");
				guessNum = scan.nextInt();
			} else {
				if (guessNum - randNum <= 3 && guessNum - randNum >= -3) {
					System.out.println("Too Close!" + randNum);
					i++;
					System.out.print("Guess again : ");
					guessNum = scan.nextInt();

				} else {
					System.out.println("Too far" + randNum);
					i++;
					System.out.print("Guess again : ");
					guessNum = scan.nextInt();

				}
			}

			if (randNum == guessNum) {
				i++;
				System.out.println("You got it right at " + i + " times ");
				System.out.print("Wanna Try again? (y/n) : ");
				char ch = scan.next().charAt(0);
				if (ch == 'y') {
					i = 0;
					System.out.print("Guess Game(0 to 20) Started!!!!\n");
					System.out.print("Guess numbers : ");
					guessNum = scan.nextInt();
				} else if (ch == 'n') {
					System.out.println("Game End!");
					break;
				} // end else if

			}

		} // end of while loop
		
		

	}

}
