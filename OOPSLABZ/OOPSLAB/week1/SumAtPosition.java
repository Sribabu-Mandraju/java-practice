package week1;

public class SumAtPosition {
    public int count(int val){
        int count =0;
        while(val !=0){
            val = val/10;
            count++;
        }
        return count;
    }
    public int find(int val){
        int original = val;
        int digit;
        int sum = 0;
        int len = count(val);
        for(int i=0;i<len;i++){
            digit = original%10;
            if(i==1 || i==len-1){
                sum = sum + digit;
            }
            original = original/10;
            
        }
        return sum;
    }
    public static void main(String[] args){
        int value = 2324343;
        SumAtPosition sm = new SumAtPosition();
        int x = sm.find(value);
        System.out.println(x);
    }
}
