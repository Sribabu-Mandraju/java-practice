package lab4;
import java.util.*;

public class CompareTwoStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name1 ;
        String name2;
        System.out.print("Enter name 1 : ");
        name1 = sc.nextLine();
        System.out.print("Enter name 2 : ");
        name2 = sc.nextLine();
        if(name1.length() == name2.length()){
            for(int i = 0;i<name1.length();i++){
                if(name1.charAt(i) != name2.charAt(i)){
                    System.out.println("the given strings are not equal");
                    break;
                }
                else{
                    if(i == name1.length()-1){
                        System.out.println("equal");
                    }
                }
                
            }
        }
        else{
            System.out.println("the given strings are not equal");
        }
    }
}
