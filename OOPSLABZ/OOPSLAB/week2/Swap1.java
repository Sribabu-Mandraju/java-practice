public class Swap1 {
    public static void main(String[] args) {
        int a = 6, b = 8;

        int save = a;
        a = b;
        b = save;
        System.out.printf("a = %d\nb = %d", a, b);
    }
}
