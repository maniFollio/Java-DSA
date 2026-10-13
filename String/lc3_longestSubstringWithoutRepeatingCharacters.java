import java.util.HashSet;

public class lc3_longestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String str) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        // String s = "abcabcbb";
        String s = "pwwkew";
        lc3_longestSubstringWithoutRepeatingCharacters lc3 = new lc3_longestSubstringWithoutRepeatingCharacters();
        lc3.lengthOfLongestSubstring(s);
    }

}
