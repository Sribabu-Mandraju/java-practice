public class SeunofDigits {

    static int SumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + SumOfDigits(n/10);
        

    }
    public static void main(String[] args){
        int sum = SumOfDigits(12342);
        System.out.println(sum);
    }
}
