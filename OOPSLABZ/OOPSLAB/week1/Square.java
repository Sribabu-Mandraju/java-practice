package week1;

import java.util.*;
public class Square {
    public void square(double val){
        System.out.println("square of given number is : " + (val*val));
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double val;
        System.out.print("Enter value = ");
        val = s.nextDouble();
        Square sqr = new Square();
        sqr.square(val);

    }
}
