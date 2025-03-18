package array;
import java.util.Scanner;
public class Calculator1 {

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
            case 1: System.out.println("Total = "+Sum (num1,num2)); 
                    // int result=Sum(num1,num2);
                    // System.out.println(result);
                break;
            case 2:  System.out.println("Total = "+Sub (num1,num2));
                    // int result=Sub(num1,num2);
                    // System.out.println(result);
                break;
            case 3:   System.out.println("Total = "+Multi (num1,num2));
                    // int result=Multi(num1,num2);
                    // System.out.println(result);
                break;
            case 4:   System.out.println("Total = "+Divided (num1,num2));
                    // int result=Divided(num1,num2);
                    // System.out.println(result);
                break;
            case 5:  System.out.println("Total = "+Modulus(num1,num2));
                    // int result=Modulus(num1,num2);
                    // System.out.println(result);
                break;
            default:
                break;
        }
        
    }
    public static int Sum(int a,int b) {
        return((a+b));
    }
    public static int Sub(int a,int b) {
        return((a-b));
    }
    public static int Multi(int a,int b) {
        return((a*b));
    }
    public static int Divided(int a,int b) {
        return((a/b));
    }
    public static int Modulus(int a,int b) {
        return((a%b));
    }
}

