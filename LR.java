
import java.util.ArrayList;
import java.util.List;

public class LR {
    static List<Integer> allIndex(int[] arr,int index,int target){
        List<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        List<Integer> prev = allIndex(arr,index+1,target);
        list.addAll(prev);
        return list;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 4, 4, 2, 4, 1};
        List<Integer> all = allIndex(nums, 0, 4); 
        System.out.println(all); 
    }
    }

