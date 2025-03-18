package chapter8;

import java.util.Scanner;

public class ShoppingCostAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{Scanner a = new Scanner (System.in);

		System.out.println("How many item did you buy today?");

		int Item = a.nextInt();
		int Total = 0;
		int Maximum = Integer.MIN_VALUE;
		int Minimum = Integer.MAX_VALUE;
		
		for (int i = 1; i <= Item; i ++)
		{System.out.println("Please enter item " + i + " amount.");
		int Amount = a.nextInt();
		Total += Amount;
		
		{
			if (i == 1)
				Maximum = Amount;
			
			else {
				if (Amount > Maximum)
					Maximum = Amount;
				
			}
			
		}
		{
			if (i == 1)
				Minimum = Amount;
			
			else {
				if (Amount < Minimum)
					Minimum = Amount;
			}
		}
		}
		
		
		
		
		System.out.println("Total Amount is " + Total + ".");
		System.out.println("Average Amount is " + Total/Item + ".");
		System.out.println("The maximum value is: " + Maximum + ".");
		System.out.println("The minimum value is: " + Minimum + ".");


	}

	}
}
