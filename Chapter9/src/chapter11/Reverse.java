package chapter11;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner a = new Scanner (System.in);
		
        System.out.println("Enter number you'd like to reverse");
        
        int Number = a.nextInt();

            System.out.println("The Reverse version: " + Reverse(Number));
            }
	
   
	   public static int Reverse(int n) {
		
		int reversed = 0;
		while (n > 0) {
			
			reversed *= 10;
		    reversed += (n % 10);
			n /= 10;
		}
			return reversed;
			
	}		

}
