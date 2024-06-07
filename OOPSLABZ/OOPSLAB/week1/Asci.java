package week1;

public class Asci {
    public void asci(char c){
        int value = (int)c;
        System.out.println("ascii value of given character is " + value);
    }
    public static void main(String[] args){
        char val = 'a';
        Asci a = new Asci();
        a.asci(val);
    }
}
