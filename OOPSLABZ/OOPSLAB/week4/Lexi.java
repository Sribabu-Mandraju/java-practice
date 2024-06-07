import java.util.Scanner;

public class Lexi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        
        
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("a) The strings are lexicographically equal (ignoring case).");
        } else {
            System.out.println("a) The strings are not lexicographically equal (ignoring case).");
        }

        // b) length 
        int lengthOfString1 = str1.length();
        int lengthOfString2 = str2.length();
        System.out.println("b) Length of the first string: " + lengthOfString1);
        System.out.println("   Length of the second string: " + lengthOfString2);

        // c) To uppercase
        String uppercaseStr1 = str1.toUpperCase();
        String uppercaseStr2 = str1.toUpperCase();
        System.out.println("c) Uppercase of the first string: " + uppercaseStr1);
        System.out.println("   Uppercase of the second string: " + uppercaseStr2);

        // d) trim whitespaces
        String trimmedStr1 = str1.trim();
        String trimmedStr2 = str1.trim();
        System.out.println("d) Trimmed first string: \"" + trimmedStr1 + "\"");
        System.out.println("   Trimmed second string: \"" + trimmedStr2 + "\"");

    
    }

}
