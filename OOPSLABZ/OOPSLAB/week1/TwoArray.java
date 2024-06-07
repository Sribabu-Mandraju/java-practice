package week1;
import java.util.*;

public class TwoArray {
    public static void twoArr(int[] arr,int[] arr2){
        int size = arr.length +arr2.length;
        int[] ek = new int[size];
        for(int i=0;i<arr.length;i++){
            ek[i] = arr[i];
        }
        for(int j=0;j<arr2.length;j++){
            ek[arr.length+1] = arr2[j];
        }
        Arrays.sort(ek);
        for(int i=0;i<arr.length;i++){
            arr[i] = ek[i];
        }
        for(int j=0;j<arr2.length;j++){
            arr2[j] = ek[arr.length-1];
        }
        for(int i=0;i<ek.length;i++){
            System.out.print(ek[i] + " ");
        }
        System.out.println();
    }
   
    public static void main(String[] args){
        int[] arr = {1,2,4,6,7};
        int arr2[] = {3,5,8};
        twoArr(arr,arr2);

    }

}
