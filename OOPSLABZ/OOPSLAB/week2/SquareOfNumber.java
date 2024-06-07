import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        num = in.nextInt();

        System.out.printf("The square of %d is %d", num, num*num);
    }
}
