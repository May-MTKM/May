package jcoreworkout;
import java.util.Scanner;

public class ReplaceAndCapitalize {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter whatever you like: ");
        String input = a.nextLine();

        String replacedString = input.replace("a", "@").replace("A", "@");
        
        String[] words = replacedString.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equalsIgnoreCase("@")) { 
                words[i] = words[i].toUpperCase();
            }
        }

        String result = String.join(" ", words);

        System.out.println("Final result: " + result);

        a.close();
    }
}