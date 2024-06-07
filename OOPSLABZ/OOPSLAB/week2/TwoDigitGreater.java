import java.util.Scanner;

public class TwoDigitGreater {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = in.nextInt();
        
        int temp = num;
        int newNumber = 0;
        int newNumber2 = 0;

        while(temp > 0){
            int digit = temp%10;
            if(digit == 9) digit = 1;
            else digit += 2;
            newNumber = newNumber*10 + digit;
            temp /= 10;
        }

        while(newNumber > 0){
            int digit = newNumber%10;
            
            newNumber2 = newNumber2*10 + digit;
            newNumber /= 10;
        }



        System.out.println(newNumber2);
    }
}
