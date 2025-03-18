package chapter11;
import java.util.Scanner;
public class DigitsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner (System.in);
		
        System.out.println("Enter your digits!");
        
        int Digits = a.nextInt();

            System.out.println("The sum is " + SumDigit(Digits) + ".");
            }
        
	
	
	public static int SumDigit(int D) {
		
		int Sum = 0;
		while (D > 0) {
			
			Sum += D%10;
			D /= 10;
		}
			return Sum;
			
	}		
}