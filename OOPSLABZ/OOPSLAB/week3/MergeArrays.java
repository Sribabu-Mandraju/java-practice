import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 5, 6, 7, 8, 10};
        int arr2[] = {2, 3, 9};

        int big[] = new int[arr1.length+arr2.length];

        int small_i = 0;
        for(int i=0; i<big.length; i++){
            if(i < arr1.length){
                big[i] = arr1[i];
            }
            else{
                big[i] = arr2[small_i];
                small_i++;
            }
            for(int j=0; j<big.length; j++){
                if(big[i] < big[j]){
                    int temp = big[i];
                    big[i] = big[j];
                    big[j] = temp;
                }
            }
        }

        int small_j = 0;
        for(int i=0; i<big.length; i++){
            if(i < arr1.length)
                arr1[i] = big[i];
            else{
                arr2[small_j] = big[i];
                small_j++;
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        
    }
}
