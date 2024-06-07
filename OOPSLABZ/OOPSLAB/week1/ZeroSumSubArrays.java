package week1;
public class ZeroSumSubArrays {

    public static void printZeroSumSubArrays(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == 0) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(nums[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };
        int[] nums2 = { 1, 2, -3, 4, 5, 6 };
        int[] nums3 = { 1, 2, -2, 3, 4, 5, 6 };

        System.out.println("Sub-arrays with 0 sum in nums1:");
        printZeroSumSubArrays(nums1);

        System.out.println("Sub-arrays with 0 sum in nums2:");
        printZeroSumSubArrays(nums2);

        System.out.println("Sub-arrays with 0 sum in nums3:");
        printZeroSumSubArrays(nums3);
    }
}
