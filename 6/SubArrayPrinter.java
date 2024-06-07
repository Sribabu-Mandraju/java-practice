public class SubArrrayPrinter {
    public static void printSubarrays(int[] arr) {
        int n = arr.length;
        // Outer loop to iterate over each starting index
        for (int i = 0; i < n; i++) {
            // Inner loop to iterate over each ending index
            for (int j = i; j < n; j++) {
                // Print subarray from index i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printSubarrays(arr);
    }
}
