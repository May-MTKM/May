package practice;
import java.util.Scanner;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String input = a.nextLine();
		
        String[] words = input.split(" "); 
        for (int i = 0; i < words.length; i++) {
            char currentChar = input.charAt(i);
            if (currentChar == ' ') {
            	continue;
        	}

        }
 
        
        a.close();
    }
        
	

	}


