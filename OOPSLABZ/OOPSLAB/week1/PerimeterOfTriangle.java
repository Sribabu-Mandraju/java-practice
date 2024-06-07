package week1;

import java.util.Scanner;

public class PerimeterOfTriangle {
    public void perimeterOfTriangle(double s1,double s2,double s3){
        System.out.println("perimeter of triangle = " + (s1+s2+s3));
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int s1,s2,s3;
        System.out.print("enter side 1 : ");
        s1 = scn.nextInt();
        System.out.print("enter side 2 : ");
        s2 = scn.nextInt();
        System.out.print("enter side 3 : ");
        s3 = scn.nextInt();
        PerimeterOfTriangle pot = new PerimeterOfTriangle();
        pot.perimeterOfTriangle(s1,s2,s3);

    }
}
