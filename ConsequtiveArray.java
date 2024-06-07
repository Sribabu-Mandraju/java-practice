public class ConsequtiveArray {
    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1,0,0,0,1,1,1,1,1,1,1,0};
        int temp =0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                if(temp<count){
                    temp = count;
                    count =0;
                }
            }
        }
        System.out.println(temp);
        
    }
}