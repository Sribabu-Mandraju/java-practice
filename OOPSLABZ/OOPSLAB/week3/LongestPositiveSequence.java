import java.util.Arrays;

public class LongestPositiveSequence {
    public static void main(String[] args) {
        int arr[] = {-12, -16, 12, 18, 18, 14, -4, 12, -13, 32, 34, -5, 66, 78, 78, -79};
                
        int n = arr.length;
        int subArrays[][] = new int[(n*(n+1))/2][];

        
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int newArr[] = new int[j-i+1];
                for(int k=i, l=0; k<=j; k++,l++){
                    newArr[l] = arr[k];
                }
                subArrays[count] = newArr;
                count++;
            }
        }
        
       
       int maxSum = 0;
       int maxlen = 0;
       int ansArr[] = new int[maxlen];
       for(int x[] : subArrays){
            boolean isPos = true;
            for(int val : x){
                if(val < 0) isPos = false;
            }

            if(isPos){
                int newSum = 0;
                for(int y : x) newSum += y;

                if(x.length >= maxlen && newSum > maxSum){
                    maxlen = x.length;
                    maxSum = newSum;
                    ansArr = x;
                }
            }
       }

       System.out.println(maxSum);
       System.out.println(Arrays.toString(ansArr));

   
   
    }

    
}
