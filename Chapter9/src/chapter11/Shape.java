package chapter11;
import java.util.Scanner;
public class Shape {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner (System.in);
		System.out.println("Choose 1 for Circle Area; choose 2 for Triangle Area; choose 3 for Square Area");
		int operator = a.nextInt();
		
		
		switch(operator) {
		case 1: System.out.println("Please enter radius value");
		int Radius = a.nextInt();
		CircleArea(Radius);
		break;
		case 2: System.out.println("Please enter base value");
		int Base = a.nextInt();
		System.out.println("Please enter Height value");
		int Height = a.nextInt();
		TriangleArea(Base, Height);
		break;
		case 3: System.out.println("Please enter side value");
		int Side = a.nextInt();
		SquareArea(Side);
		break;
		}}
	
	public static void CircleArea(int r) {
		// TODO Auto-generated method stub
		
		System.out.println("Circle Area: " + (3.14 * r*r));
		
	}

	public static void TriangleArea(int b, int h) {
		// TODO Auto-generated method stub
		
		System.out.println("Triangle Area: " + 0.5 * b * h);
		
	}

	public static void SquareArea(int s) {
		// TODO Auto-generated method stub
		
		
			
			System.out.println("Square Area: " + s * s);
		}
		
	

}
