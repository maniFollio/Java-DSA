public class lc344_revrseString {
    public void reverseString(char[] s) {
        reverseWord(s, 0, s.length - 1);
    }

    void reverseWord(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        reverseWord(s, left + 1, right - 1);
    }
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        lc344_revrseString lc344 = new lc344_revrseString();
        lc344.reverseString(arr);

    }
}



// Leetcode not acceptable
    // public void reverseString(char[] s) {
    // String rev = reverseWord(new String(s));
    // for(int i = 0; i < s.length; i++){
    // s[i] = rev.charAt(i);
    // }
    // }

    // String reverseWord(String str) {
    // if (str == null || str.length() <= 1) {
    // return str;
    // }
    // return reverseWord(str.substring(1)) + str.charAt(0);
    // }
