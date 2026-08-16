public class lc392_isSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        // String s = "abc";
        // String t = "ahbgdc";
        String s = "abcd";
        String t = "abc";
        lc392_isSubsequence lc392 = new lc392_isSubsequence();
        boolean res = lc392.isSubsequence(s, t);
        System.out.println(res);
    }
}
