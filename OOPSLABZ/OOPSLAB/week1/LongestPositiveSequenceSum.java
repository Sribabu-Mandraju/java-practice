package week1;

public class LongestPositiveSequenceSum {

    public static void longestPositiveSequenceSum(int[] nums) {
        int currentSum = 0;
        int maxSum = 0;
        int maxCount =0;
        int count=0;
        int start = 0;
        int end=0;
        boolean val = true;
        boolean sta = true;


        for (int i = 0; i < nums.length; i++) {
            start=0;
            end=0;
            if (nums[i] > 0 ) {
                if(sta){
                    start = i;
                    sta= false;
                }
                end++;
                currentSum += nums[i];
                count++;
                
            }
             else {
               
                
                if (currentSum > maxSum && count>maxCount ){
                    maxSum = currentSum;
                    maxCount = count;
                    end=0;
                }
                currentSum = 0;
                count = 0;
            }
        }
        if (currentSum > maxSum && count>maxCount) {
            maxSum = currentSum;
            maxCount = count;
            
        }
        System.out.println("Max sum : "+ (maxSum));
        System.out.println(start);
        System.out.println(end-1);
        for(int k=start;k<=end-1;k++){
            System.out.print(nums[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] input1 = {-12,-16,12,18,18,14,-4,12,-13,32,34,-5,66,78,78,-79,12,18,18,15};
        longestPositiveSequenceSum(input1);
    }
}

