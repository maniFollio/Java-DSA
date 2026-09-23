public class lc557_ReverseWordsinaStringIII {
    String reverseWord(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.trim().split(" ");

        for (int i = 0; i < str.length; i++) {

            char[] ch = str[i].toCharArray();
            int left = 0;
            int right = ch.length - 1;

            while (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                right--;
                left++;
            }
            sb.append(ch);
            if (str.length - 1 != i) {
                sb.append(" ");
            }
        }
        return sb.toString();
        // System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        lc557_ReverseWordsinaStringIII lc557 = new lc557_ReverseWordsinaStringIII();
        String ans = lc557.reverseWord(str);
        System.out.println(ans);
    }
}
