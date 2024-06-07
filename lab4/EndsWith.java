package lab4;

import java.util.*;

public class EndsWith {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        String key;
        System.out.print("enter string : ");
        name = sc.nextLine();
        System.out.print("enter string : ");
        key = sc.nextLine();
        int key_len =  key.length();
        boolean ismatch = true;
        for(int i = 0;i < key.length();i++){
            if(name.charAt(name.length() - key_len + i) != key.charAt(i)){
                ismatch = false;
                break;
            }
        }
        if(ismatch){
            System.out.println("equal");
        }
}
}
