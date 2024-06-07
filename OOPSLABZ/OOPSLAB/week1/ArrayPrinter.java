package week1;

public class ArrayPrinter {
    public static void printSub(int arr[]) {
        int n = arr.length;
        int i,j,k;
        for ( i = 0; i < n; i++) {
            int sum = 0;
           for( j = i ;j<n;j++){
            sum = sum+arr[j];
           }
           if(sum==0){
            for( k = i;k<j;k++){
                System.out.print(arr[k]+",");
            }
           }
        }
    }
    

    public static void main(String args[]){
        int arr[] = {-1, 2, 3, 1, -2, 30, 0, 2, -3, -5};
        printSub(arr);
    }
}
