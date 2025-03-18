package game;

import java.util.Random;

import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Random rand = new Random();
			
		  int Random = rand.nextInt(21);
		  
		  {Scanner a = new Scanner (System.in);

		System.out.println("Please guess a number from 1 to 20.");
		System.out.println("Please guess my number.");

		int Number = a.nextInt();
		
		while (Number != Random)
		{System.out.println("No, you're wrong.");
		System.out.println("Please try again.");
		Number = a.nextInt();
		
		}
		
		System.out.println("Wow, you win. CONGRATS");
		System.out.println("Game Ended");
	}

}
	}
