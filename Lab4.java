import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Lab4 {

    public static void main(String args[]){
        int num = 0203;
        String strNum = String.valueOf(num);
        char[] charArray = strNum.toCharArray();
        ArrayList<Character> charSeq = new ArrayList<>();
        for(int i=1;i<charArray.length;i++){
            charSeq.add(charArray[i]);
        }
        System.out.println(charSeq.contains('0'));
        if(charArray[0] != '0' && charSeq.contains('0')){
            System.out.println("duck");
        }
        else{
            System.out.println("not duck");
        }
    }
}
