import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = in.nextInt();

        int reverseNumber = 0;

        while(num > 0){
            int digit = num%10;
            reverseNumber = reverseNumber*10 + digit;
            num /= 10;
        }

        System.out.printf("Reversed Number: %d", reverseNumber);

    }
}
