import java.util.Scanner;
import java.util.Arrays;

public class StrToCharArr {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        
        char[] charArray = str.toCharArray();

        
        System.out.println("Character array: " + Arrays.toString(charArray));

      
        in.close();
    }
}
