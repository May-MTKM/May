package chapter11;
import java.util.Scanner;
public class Position {

    public static void main(String[] args) {
       
        Scanner a = new Scanner(System.in);

        
        System.out.println("How many numbers are you going to enter?");
        int Length = a.nextInt();
        int[] Numbers = new int[Length];

        
        for (int i = 0; i < Length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            Numbers[i] = a.nextInt();
        }

        
        System.out.println("Please enter the number you'd like to search from your given numbers:");
        int Search = a.nextInt();

       
        int Position = SearchNumber(Numbers, Search);

       
        if (Position != -1) {
            System.out.println("The number " + Search + " is found at position " + Position + ".");
        } else {
            System.out.println("The number " + Search + " is not found in the position.");
        }

    }

    
    public static int SearchNumber(int[] Numbers, int num) {
      
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == num) {
                return i; 
            }
        }
        return -1; 
    }
}
