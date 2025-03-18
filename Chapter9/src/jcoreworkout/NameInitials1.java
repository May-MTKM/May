package jcoreworkout;
import java.util.Scanner;

public class NameInitials1 {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = a.nextLine();
        String initials = "";
        
        if (fullName.length() > 0) {
            initials = initials.concat(String.valueOf(fullName.charAt(0)));
        }
        
        for (int i = 1; i < fullName.length(); i++) {
            if (fullName.charAt(i - 1) == ' ') {
                initials = initials.concat(String.valueOf(fullName.charAt(i)));
            }
            else if (Character.isUpperCase(fullName.charAt(i))) {
                initials = initials.concat(String.valueOf(fullName.charAt(i)));
            }
        }
        System.out.println("Name's initials: " + initials.toUpperCase());
     
        a.close();
    }
}
//use more memory