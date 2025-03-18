package jcoreworkout;
import java.util.Scanner;

public class ReplaceAndCapitalize1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter whatever you like: ");
        String input = a.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'a' || currentChar == 'A') {
                result.append('@');
            } else {
                result.append(Character.toUpperCase(currentChar));
            }
        }
        String finalResult = result.toString();
        System.out.println("Final result: " + result);
        a.close();
    }
}