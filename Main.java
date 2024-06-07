import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(nums, 0, new ArrayList<>(), result);
        
        // Print all combinations
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    public static void findCombinations(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Add the current combination to the result
        result.add(new ArrayList<>(current));

        // Generate combinations with elements after the current index
        for (int i = index; i < nums.length; i++) {
            // Include the current element in the combination
            current.add(nums[i]);
            // Recursively generate combinations with remaining elements
            findCombinations(nums, i + 1, current, result);
            // Exclude the current element from the combination to consider other combinations
            current.remove(current.size() - 1);
        }
    }
}
