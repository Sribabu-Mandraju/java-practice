import java.util.Scanner;

public class SumOfFirstAndLast {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = in.nextInt();

        int firstDigit = 0, lastSecondDigit = 0;    

        int count = 0;
        while(num > 0){
            if(count == 1) lastSecondDigit = num%10;
            firstDigit = num%10;
            num /= 10;
            count++;
        }

        int sum = firstDigit + lastSecondDigit;
        System.out.printf("%d + %d = %d",firstDigit, lastSecondDigit, sum);

        
    }
}
