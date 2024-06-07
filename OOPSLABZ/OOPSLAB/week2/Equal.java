import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Please enter the second number: ");
        num2 = in.nextInt();
        System.out.print("Please enter the third number: ");
        num3 = in.nextInt();

        if(num1 == num2 && num1 == num3)
            System.out.println("All are equal...!");
        else if(num1 == num2 || num2 == num3 || num1 == num3)
            System.out.println("Two are equal...!");
        else{
            System.out.println("Nothing...!");
        }
    }
}
