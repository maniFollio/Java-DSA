import java.util.HashSet;

public class lc3_longestSubstringWithoutRepeatingCharacters {

    void longestSubstring(String str) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char current = str.charAt(i);
            while (set.contains(current)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(current);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        // return maxLen;
        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        // String s = "abcabcbb";
        String s = "pwwkew";
        lc3_longestSubstringWithoutRepeatingCharacters lc3 = new lc3_longestSubstringWithoutRepeatingCharacters();
        lc3.longestSubstring(s);
    }

}
