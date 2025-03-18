package jcoreworkout;
import java.util.Scanner;
public class RepeatedChs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner (System.in);
		System.out.println("Enter whatever you like: ");
		String input = a.nextLine();
		
		StringBuilder repeatedChs = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            if (currentChar == ' ') {
                continue;
            }
            
            boolean isRepeated = false;
            for (int j = i + 1; j < input.length(); j++) {
                if (currentChar == input.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            if (isRepeated && repeatedChs.indexOf(String.valueOf(currentChar)) == -1) {
                if (repeatedChs.length() > 0) {
                	repeatedChs.append(", ");
                }
                repeatedChs.append(currentChar);
            }
        }
        if (repeatedChs.length() == 0) {
            System.out.println("No repeated characters found.");
        } else {
            System.out.println("The repeated characters: " + repeatedChs.toString());
        }

            
		a.close();
		
	}

	}


