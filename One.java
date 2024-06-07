
import java.util.ArrayList;
import java.util.List;

public class One {

    static List<Integer> AllIndexes(int[] arr, int target, int index, List<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return AllIndexes(arr, target, index + 1, list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] nums = {1, 2, 3, 4, 5, 4, 4, 2, 4, 1};
        List<Integer> all = AllIndexes(nums, 4, 0, list); // Store the result of AllIndexes
        System.out.println(all); // Print the result
    }
}
