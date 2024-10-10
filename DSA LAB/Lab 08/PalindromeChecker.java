public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }

        return false;
    }

    public static void main(String[] args) {
        String input = "racecar"; 

        boolean result = isPalindrome(input);

        System.out.println("Is \"" + input + "\" a palindrome? " + result);
    }
}
