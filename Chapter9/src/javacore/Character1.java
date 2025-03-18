package javacore;
import java.util.Scanner;
public class Character1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner (System.in);
		System.out.println("Enter a charater: ");
		char charater = a.next().charAt(0);
		 
		 
		if (charater >= 65 && charater <= 90) {
            System.out.println("The character is a capital letter.");
        } else if (charater >= 97 && charater <= 122) {
            System.out.println("The character is a small case letter.");
        } else if (charater >= 48 && charater <= 57) {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is a special symbol.");
        }
		
		
		 
	}

}
