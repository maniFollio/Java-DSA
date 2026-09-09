import java.util.Arrays;

public class lc389_FindtheDifference {
    char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) {
                return tArr[i];
            }
        }
        return tArr[tArr.length - 1];
    }

    public static void main(String[] args) {
        // String s = "abcd";
        // String t = "abcde";
        String s = "a";
        String t = "aa";
        lc389_FindtheDifference lc389 = new lc389_FindtheDifference();
        char c = lc389.findTheDifference(s, t);
        System.out.println(c);
    }
}
