package lab4;
import java.util.*;

public class StringOfArray {
    public static void main(String[] args){
        String array = "sribabu is the programmer of the world";
        char[] sequence  = new char[array.length()];
        for(int i = 0;i<array.length();i++){
              sequence[i] = array.charAt(i);
        }
        boolean kama = true;
        System.out.print("[");
        for(int i = 0;i<array.length();i++){
            if(kama){
                System.out.print("'"+sequence[i] + "'");
                kama = false;
            }
            else{
                System.out.print(","+"'"+sequence[i] + "'");
            }
      }
      System.out.println("]");

    }
}
