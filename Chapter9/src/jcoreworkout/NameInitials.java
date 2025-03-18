package jcoreworkout;

import java.util.Scanner;

public class NameInitials {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = a.nextLine();
        StringBuilder initials = new StringBuilder();
        
        if (fullName.length() > 0) {
            initials.append(fullName.charAt(0));
        }
        
        for (int i = 1; i < fullName.length(); i++) {
           
            if (fullName.charAt(i) == ' ') {
                initials.append(fullName.charAt(i+1));
            }

            else if (Character.isUpperCase(fullName.charAt(i)) && Character.isLowerCase(fullName.charAt(i - 1))) {
            	 initials.append(fullName.charAt(i));
            }
            
        }
        
        System.out.println("Name's initials: " + initials.toString().toUpperCase());
        
        a.close();
    }
}
