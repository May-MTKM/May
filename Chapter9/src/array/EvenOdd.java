package array;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{Scanner a = new Scanner (System.in);
		System.out.println("How many numbers are you going to enter?");
		int Length = a.nextInt();
		int [] A = new int[Length];
		
		int EvenCount = 0;
		int OddCount = 0;
		
		 for (int i = 0; i < Length; i++)
		    {System.out.println("Enter number " + (i + 1) + ":");
		    A[i] = a.nextInt();
		    
		    if (A[i]%2 == 0)
		    {EvenCount++;}
		    else 
		    {OddCount++;}

		    }//END OF LOOP
		 
		 System.out.println("Even Count: " + EvenCount);
		 System.out.println("Odd Count: " + OddCount);
		 
		}
		
	}
}
