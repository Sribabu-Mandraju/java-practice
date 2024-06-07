public class Pattern {
    static void pattern1(int r,int c){
        if(r==0){
            return;
        }
        else{
            if(c<r){
                System.out.print(" # ");
                pattern1(r, c+1);
            }
            else{
                System.out.println();
                pattern1(r-1,0);
            }
        }
    }
    static void pattern2(int r,int c){
        if(r==4){
            return;
        }
        else{
            if(c<=r){
                System.out.print(" # ");
                pattern2(r, c+1);
            }
            else{
                System.out.println();
                pattern2(r+1,0);
            }
        }
    }

    static void pattern3(int order, int r, int c) {
        if (r >= order || c >= order) {
            return; // Base case: out of bounds
        }
    
        if (r == c) {
            System.out.print("*"); // Print asterisk on the diagonal
        } else {
            System.out.print(" "); // Print space off the diagonal
        }
    
        if (c == order - 1) { // End of the row
            System.out.println(); // Move to the next line
            pattern3(order, r + 1, 0); // Recursive call for the next row
        } else {
            pattern3(order, r, c + 1); // Recursive call for the next column
        }
    }
    public static void main(String[] args){
        // pattern1(4, 0);
        // pattern2(0, 0);
        pattern3(4, 0, 0);
    }
}
