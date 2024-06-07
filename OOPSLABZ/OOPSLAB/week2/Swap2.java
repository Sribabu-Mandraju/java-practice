public class Swap2 {
    public static void main(String[] args) {
        int a = 6, b = 8;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.printf("a = %d\nb = %d", a, b);
    }
}
