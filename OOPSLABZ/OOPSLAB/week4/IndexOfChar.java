public class IndexOfChar {
    public static void main(String[] args) {

        char[] arr = new char[10];
        
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 10; col++) {
                int index = row * 10 + col;
                if (index < alphabet.length) {
                    System.out.print(alphabet[index] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("=========================");

        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 10; col++) {
                int index = row * 10 + col;
                if (index < alphabet.length) {
                    int charIndex = alphabet[index] - 'a' + 1;
                    System.out.print(charIndex + " ");
                }
            }
            System.out.println();
        }
    }
}
