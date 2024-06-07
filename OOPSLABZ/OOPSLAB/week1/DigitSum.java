package week1;

public class DigitSum {
    public int digitSum(int val){
        int original = val;
        int newOriginal = 0;
        int update;
        
        while(original != 0){
            update = original%10;
            if(update == 8){
                update =0;
            }
            else if (update == 9){
                update = 1;
            }
            else{
                update = update +2;
            }
            newOriginal = newOriginal*10+(update);
            original = original/10;
        }
        return newOriginal;
    }

    public int TwoDigitSum(int val){
        int original = val;
        int newOriginal = 0;
        while(original != 0){
            int update = original%10;
            newOriginal = newOriginal*10+(update);
            original = original/10;
        }
        return newOriginal;
    }
    
    public static void main(String[] args){
        DigitSum ds = new DigitSum();
        int x = ds.digitSum(22942);
        int y = ds.TwoDigitSum(x);
        System.out.println(y);
    }
}                                      
