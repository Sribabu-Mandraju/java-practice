import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, -7, 5, 8, -5, 9};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int max1 = arr[0]*arr[1];
        int max2 = arr[arr.length-1]*arr[arr.length-2];

        if(max1 > max2) 
            System.out.printf("Max product pair: (%d, %d)", arr[0], arr[1]);
        else
            System.out.printf("Max product pair: (%d, %d)", arr[arr.length-1], arr[arr.length-2]);

        // int pair[] = new int[2];
        // int product = 1;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr.length; j++){
        //         if(i != j){
        //             int newProduct = arr[i]*arr[j];
        //             if(newProduct > product){
        //                 product = newProduct;
        //                 pair[0] = arr[i];
        //                 pair[1] = arr[j];
        //             }
        //         }
        //      }
        // }
        // System.out.println(product);
        // System.out.println(Arrays.toString(pair));
       
    }
}
