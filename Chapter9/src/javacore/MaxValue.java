package javacore;
import java.util.Scanner;
public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner (System.in);
		
		System.out.println("Please enter the first number.");
		int Value1 = a.nextInt();
		System.out.println("Please enter the second number.");
		int Value2 = a.nextInt();
		System.out.println("Please enter the third number.");
		int Value3 = a.nextInt();
		
		int Max = (Value1 > Value2) ? (Value1 > Value3 ? Value1 : Value3): (Value2 > Value3 ? Value2 : Value3);
		
		
		System.out.println("The largest number: " + Max);
				

	}

}
