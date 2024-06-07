public class InterLeaving {

    public static void main(String[] args) {
        String str1 = "WX";
        String str2 = "YZ";
        findInterleavings(str1, str2, "");
    }

    public static void findInterleavings(String str1, String str2, String result) {
        if (str1.isEmpty() && str2.isEmpty()) {
            System.out.println(result);
            return;
        }

        if (!str1.isEmpty()) {
            findInterleavings(str1.substring(1), str2, result + str1.charAt(0));
        }

        if (!str2.isEmpty()) {
            findInterleavings(str1, str2.substring(1), result + str2.charAt(0));
        }
    }
}
