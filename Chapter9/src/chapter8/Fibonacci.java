package chapter8;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args){
		
	
		{Scanner S = new Scanner (System.in);
		
		System.out.println("Please enter a value for the first number.");
		
		int f = S.nextInt();
		
		System.out.println("Please enter a value for the second number.");
		
		int s = S.nextInt();
		
		System.out.println("F0 : " + f);
		
		System.out.println("F1 : " + s);
		
		for (int i = 2; i<= 100; i++) {
			
			int t = f + s;
			
			System.out.println("f" + i + " : " + t);
			
			f = s;
			s = t;
			
		}
		
		
		}
		}	
	}

