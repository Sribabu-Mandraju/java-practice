package week1;

import java.util.*;


public class AreaOfTriangel {

    public void areaOfTriangle(double length , double breadth){
        double area;
        area = 0.5*length*breadth;
        System.out.println("area of triangle = " +area);
    }

    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        double length;
        double breadth;
        System.out.print("enter length of triangle : ");
        length = s.nextDouble();
        System.out.print("enter breadth of triangle : ");
        breadth = s.nextDouble();
        AreaOfTriangel at = new AreaOfTriangel();
        at.areaOfTriangle(length,breadth);
        s.close();
        
    }
}
