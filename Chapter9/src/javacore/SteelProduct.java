package javacore;
import java.util.Scanner;
public class SteelProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner (System.in);
		
		System.out.println("Hardness: ");
		double Hardness = a.nextDouble();
		
		System.out.println("Carbon: ");
		double Carbon = a.nextDouble();
		
		System.out.println("Tensile: ");
		double Tensile = a.nextDouble();
		
		boolean Condition1 = Hardness > 50;
        boolean Condition2 = Carbon < 0.7;
        boolean Condition3 = Tensile > 5600; 
        
        if (Condition1 && Condition2 && Condition3) {
        	System.out.println("Steel Grade: 10");
        } else if (Condition1 && Condition2) {
        	System.out.println("Steel Grade: 9");
        } else if (Condition2 && Condition3) {
        	System.out.println("Steel Grade: 8");
        } else if (Condition1 && Condition3) {
        	System.out.println("Steel Grade: 7");
        } else if (Condition1 || Condition2 || Condition3) {
        	System.out.println("Steel Grade: 6");
        }
        else {
        	System.out.println("Steel Grade: 5");
    }
        
	}

}
