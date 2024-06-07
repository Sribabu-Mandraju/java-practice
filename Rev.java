public class Rev {
    static int sum =0;
    static void Reverse(int n){
        if(n==0){
            System.out.println(sum);
            return;
        }
        int last = n%10;
        sum = (sum*10) + last;
        Reverse(n/10);
    }
    public static void main(String[] args){
        Reverse(1322131);
    }
}
