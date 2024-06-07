import java.util.Arrays;

public class ZeroSumSubArray{
    public static void main(String[] args) {
        int arr[] = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                int newArr[] = new int[j-i+1];
                for(int k=i, l= 0; k <= j; k++, l++){
                    sum += arr[k];
                    newArr[l] = arr[k];
                }
                if(sum == 0){
                    System.out.println(Arrays.toString(newArr));
                }
            }
        }
    }
}