public class lc541_reverseStringII {
    String revrseString(String s, int k) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length-1; i += (2 * k)) {
            char temp = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = temp;
            // return ch;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        // String str = "abcdefg";
        String str = "abcd";
        int k = 2;
        lc541_reverseStringII lc541 = new lc541_reverseStringII();
        String ans = lc541.revrseString(str, k);
        System.out.println(ans);
    }
}
