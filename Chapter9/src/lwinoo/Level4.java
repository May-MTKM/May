package lwinoo;
import java.util.Random;
import java.util.Scanner;
public class Level4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Game Started!");
		System.out.print("Enter Max Possible Numbers :  ");
		int possibleNum = scan.nextInt();
		int randNum = rand.nextInt(possibleNum) + 1;
		System.out.println("Enter numbers between 0 and " + possibleNum);
		System.out.print("Guess numbers : ");
		int guessNum = scan.nextInt();
		while (randNum != guessNum) {
			if (guessNum < 0 || guessNum > possibleNum) {
				System.out.println("guess the number between 0 and " + possibleNum);
				System.out.print("Guess again : ");
				guessNum = scan.nextInt();
			} else {
				if (guessNum - randNum <= 3 && guessNum - randNum >= -3) {
					System.out.println("Too Close!"); // 5 - 3 = -3
					i++;
					System.out.print("Guess again : ");
					guessNum = scan.nextInt();

				} else {
					System.out.println("Too far");
					i++;
					System.out.print("Guess again : ");
					guessNum = scan.nextInt();

				}
			}

			if (randNum == guessNum) {
				i++;
				System.out.println("You got it right at " + i + " times ");
				System.out.print("Wanna Try again? (y/n) : ");
				char ch = scan.next().toLowerCase().charAt(0);
				if (ch == 'y') {
					i = 0;
					System.out.println("Game Started!");
					System.out.print("Enter Max Possible Numbers :  ");
					possibleNum = scan.nextInt();
					System.out.print("Guess numbers : ");
					guessNum = scan.nextInt();
				} else if (ch == 'n') {
					System.out.println("Game End!");
					break;
				}else {
					System.out.println("You info is wrong!");
					break;
				}

			}

		} // end of while loop


	}

}
