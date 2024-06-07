import java.util.Scanner;

public class CompareStrObj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       
        System.out.print("Enter the first string: ");
        String str1 = in.nextLine();

      
        System.out.print("Enter the second string: ");
        String str2 = in.nextLine();

       

        
        if (str1.equals(str2)) {
            System.out.println("The two strings contain the same data.");
        } else {
            System.out.println("The two strings do not contain the same data.");
        }

        in.close();
    }

    
}
