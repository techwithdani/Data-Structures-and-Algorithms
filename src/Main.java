public class Main {
    public static void main(String[] args) {
        String check1 = "YOOOOOY";
        String check2 = "tatakae";
        String check3 = "YEEEAEEEY";
        String check4 = "messi";

        boolean result1 = checkPalindrome(check1);
        boolean result2 = checkPalindrome(check2);
        boolean result3 = checkPalindrome(check3);
        boolean result4 = checkPalindrome(check4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }

    public static Boolean checkPalindrome(String randomString) {
        int left = 0;
        int right = randomString.length() - 1;

        while (left < right) {
            if (randomString.charAt(left) != randomString.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}