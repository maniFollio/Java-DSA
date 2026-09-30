import java.util.HashSet;

public class lc409_LongestPalindrome {
    // Approach 1

    public int longestPalindrome(String s) {
        int len = 0;
        int[] charCount = new int[128];
        for (char ch : s.toCharArray()) {
            charCount[ch]++;
        }
        for (int count : charCount) {
            len += (count / 2) * 2;
        }
        if (len < s.length()) {
            len += 1;
        }
        return len;
    }

    // Approach 2
    public int longestPalindrome_2(String s) {
        HashSet<Character> set = new HashSet<>();
        int len = 0;
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
                len += 2;
            } else {
                set.add(ch);
            }
        }
        if (!set.isEmpty()) {
            len += 1;
        }
        return len;
    }
}
