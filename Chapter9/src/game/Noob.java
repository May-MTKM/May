package game;

import java.util.Random;

import java.util.Scanner;

public class Noob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Random rand = new Random();
			
		  int Random = rand.nextInt(7);
		  
		  {Scanner a = new Scanner (System.in);

		System.out.println("Please guess a number");

		int Number = a.nextInt();
		
		if (Random == Number)
			System.out.println("You win! CONGRATS!");
		
		else
			System.out.println("Fail.");
		

	    }

	}

	}

