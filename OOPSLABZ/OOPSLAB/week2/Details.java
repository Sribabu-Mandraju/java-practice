import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, fieldOfInterest;
        int rollNo;

        System.out.print("Please enter your name: ");
        name = in.next();
        System.out.print("Please enter your roll no: ");
        rollNo = in.nextInt();
        System.out.println();
        System.out.print("Please enter your field of interest: ");
        fieldOfInterest = in.next();

        System.out.printf("Hey my name is %s and my roll number is %d. My field of interest is %s", name, rollNo, fieldOfInterest);

    }
}
