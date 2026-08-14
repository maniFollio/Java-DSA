public class lc541_reverseStringII {
    String revrseString(String s, int k) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i += (2 * k)) {
            int left = i;
            int right = Math.min(i + k - 1, ch.length - 1);
            while (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
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
