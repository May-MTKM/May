package array;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
        System.out.println("Enter number first number");
        int num1= s.nextInt();
        System.out.println("Enter number second number");
        int num2= s.nextInt();
        System.out.println("Enter number 1 to 5 for process(1+ 2- 3* 4/ 5%)");
        int operator= s.nextInt();
        switch (operator) {
            case 1: Sum (num1,num2);
                break;
            case 2: Sub (num1,num2);
                break;
            case 3: Multi (num1,num2);
                break;
            case 4: Divided (num1,num2);
                break;
            case 5: Modulus (num1,num2);
                break;
            default:
                break;
        }
        
    }
    public static void Sum(int a,int b) {
        System.out.println("Total = "+(a+b));
    }
    public static void Sub(int a,int b) {
        System.out.println("Total = "+(a-b));
    }
    public static void Multi(int a,int b) {
        System.out.println("Total = "+(a*b));
    }
    public static void Divided(int a,int b) {
        System.out.println("Total = "+(a/b));
    }
    public static void Modulus(int a,int b) {
        System.out.println("Total = "+(a%b));


	}

}
