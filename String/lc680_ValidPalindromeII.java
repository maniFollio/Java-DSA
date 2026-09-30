import java.util.HashSet;

public class lc680_ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(right) == s.charAt(left)) {
                left++;
                right--;
            } else {
                return isValidPalindrome(s, left + 1, right) || isValidPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    boolean isValidPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abca";
        lc680_ValidPalindromeII lc680 = new lc680_ValidPalindromeII();
        System.out.println(lc680.validPalindrome(s));
    }
}
