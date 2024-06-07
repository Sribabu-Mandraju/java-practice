import java.util.*;

public class ScannerIO {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String name ;
        System.out.print("enter name =");
        name = scn.next();
        System.out.println("name = "+ name);
        int num;
        System.out.print("enter num");
        num = scn.nextInt();
        System.out.print("num = "+(num+2));
    }
}
