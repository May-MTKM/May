package array;
import java.util.Scanner;
public class Testing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array:");
        int Number = a.nextInt();
		
        int[] Ary = new int[Number];
        
        System.out.println("Enter " + Number + " numbers.");
		
        for (int i = 0; i < Number; i++) {
            Ary[i] = a.nextInt();
        }
        int Max = Ary[0], Min = Ary[0], Total = 0;
        
        for (int i = 0; i < Ary.length; i++) {
            if (Ary[i] > Max) {
                Max = Ary[i];
            }
            if (Ary[i] < Min) {
                Min = Ary[i];
            }
            Total += Ary[i];
        }
        
		System.out.println("Max is " + Max);
		System.out.println("Min is " + Min);
		System.out.println("Total is " + Total);
	}

}
