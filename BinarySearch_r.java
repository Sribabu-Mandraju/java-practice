public class BinarySearch_r {

    public static int BS(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return BS(arr, target, mid + 1, high); // Adjusted the indices here
            } else if (arr[mid] > target) {
                return BS(arr, target, low, mid - 1); // Adjusted the indices here
            }
        }
        return -1;
    }
    static void print(int n){
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 15;
        int res = BS(array, target, 0, array.length - 1);
        if (res != -1) {
            System.out.println("Element found at index " + res);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
