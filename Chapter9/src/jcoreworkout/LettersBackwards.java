package jcoreworkout;
import java.util.Scanner;
public class LettersBackwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter whatever you like: ");
		String input = a.nextLine();
		
		for (int i = input.length() - 1; i >= 0; i--) {
           
            System.out.print(input.charAt(i));
        }
       
        a.close();
    }

	}


