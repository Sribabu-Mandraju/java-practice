public class RBS {
    static int rbs(int[] arr,int start,int end,int target){
        int mid = start + (end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[end]){
            if(target >= arr[start] && target <= arr[end]){
                return rbs(arr,start,mid-1,target);
            }
            else{
                return rbs(arr,mid+1,end,target);
            }
        }
    }
    public static void main(String[] args){
        int[] nums= {1,2,3,4,5,6,7,34};
        int key = 34;
        int indexValue = rbs(nums,0,nums.length-1,key);
        System.out.println(indexValue);
    }
}
