package DSA.String;

public class LongestCommomPrefix {
    String longestCommonPrefix(String[] str) {
        int minLen = str[0].length();
        for (String s : str) {
            minLen = Math.min(s.length(), minLen);
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < minLen; i++) {
            char ch = str[0].charAt(i);
            for (String s : str) {
                if (s.charAt(i) != ch) {
                    return res.toString();
                }
            }
            res.append(ch);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] s = { "flower", "flow", "flight" };
        LongestCommomPrefix lc14 = new LongestCommomPrefix();
        String res = lc14.longestCommonPrefix(s);
        System.out.println(res);
    }

}
