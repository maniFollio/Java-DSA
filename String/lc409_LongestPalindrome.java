public class lc409_LongestPalindrome {
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
}
