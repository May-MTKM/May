package javacore;
import java.util.Scanner;
public class SteelProduct1 {
	
	public static void main(String[] args, String GradeSteel) {
		// TODO Auto-generated method stub
		 
        Scanner a = new Scanner (System.in);
		
		System.out.println("Hardness: ");
		double Hardness = a.nextDouble();
		
		System.out.println("Carbon: ");
		double Carbon = a.nextDouble();
		
		System.out.println("Tensile: ");
		double Tensile = a.nextDouble();
		
		int SteelGrade = GradeSteel(Hardness,Carbon,Tensile);
		System.out.println("Steel Grade: " + GradeSteel);
	}

	 public static int GradeSteel(double Hardness,double Carbon,double Tensile) {
		 
		 int Grade = 5;
	      boolean Condition1 = Hardness > 50;
	        boolean Condition2 = Carbon < 0.7;
	        boolean Condition3 = Tensile > 5600;

	        // Check all conditions for grade assignment
	        if (Condition1 && Condition2 && Condition3) {
	        	Grade = 10;
	        } else if (Condition1 && Condition2) {
	        	Grade = 9;
	        } else if (Condition2 && Condition3) {
	        	Grade = 8;
	        } else if (Condition1 && Condition3) {
	        	Grade = 7;
	        } else if (Condition1 || Condition2 || Condition3) {
	        	Grade = 6;
	        }

	        return Grade;
	    }
	
		 
		 
	 }


