public class LongestPalindromicSubstring {

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        String longest = "";
        int n = s.length();

        // Generate all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s.substring(i, j);
                // Check if the substring is a palindrome
                if (isPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        return longest;
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        String s = "abcdea";
        System.out.println("Longest palindromic substring is: " + longestPalindrome(s));
    }
}
