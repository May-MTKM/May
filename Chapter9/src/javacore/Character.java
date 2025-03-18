package javacore;
import java.util.Scanner;
import java.io.IOException;
public class Character {

	public static void main(String[] args) 
	throws IOException {
		// TODO Auto-generated method stub

		Scanner a = new Scanner (System.in);
		System.out.println("Enter a charater: ");		 

		int charater = System.in.read();
		 
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
