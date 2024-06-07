public class BinarySearch {
    public static void main(String[] args){
        int arr[] = {1,3,4,5,6,7,8,10,45,56};
        int min = 0;
        int max = arr.length-1;
        int mid = (min+max)/2;
        int count =0;
        int key = 45;
        while(min <= max){
            if (mid == key){
                System.out.println("found at" + mid);
                count++;
                break;
            }
            else if(key >arr[mid]){
                min = mid+1;
                count++;
            }
            else if(key <arr[mid]){
                max = mid -1;
                count++;
            }
        }
    }
}
