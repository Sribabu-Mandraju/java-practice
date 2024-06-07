import java.util.Scanner;

public class ContainsSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        
        System.out.print("Enter the sequence to check: ");
        String sequence = scanner.nextLine();

    
              
        if (str.contains(sequence)) {
            System.out.println("The string contains the specified sequence.");
        } else {
            System.out.println("The string does not contain the specified sequence.");
        }

        scanner.close();
    }

    
    
}
