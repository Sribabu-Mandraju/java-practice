import java.util.Scanner;

public class EndsWith {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        
        System.out.print("Enter the ending string to check: ");
        String endStr = in.nextLine();

    
        
        
        if (str.endsWith(endStr)) {
            System.out.println("The string ends with the specified ending string.");
        } else {
            System.out.println("The string does not end with the specified ending string.");
        }

        in.close();
    }

        
}
