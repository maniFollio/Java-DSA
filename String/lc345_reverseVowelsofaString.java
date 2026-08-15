public class lc345_reverseVowelsofaString {
    String revrseVowel(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right) {
            if ("aeiouAEIOU".indexOf(ch[left]) != -1 && "aeiouAEIOU".indexOf(ch[right]) != -1) {
                char tmp = ch[left];
                ch[left] = ch[right];
                ch[right] = tmp;
                right--;
                left++;
            } else if ("aeiouAEIOU".indexOf(ch[left]) == -1) {
                left++;
            } else if ("aeiouAEIOU".indexOf(ch[right]) == -1) {
                right--;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "IceCreAm"; // Output --> AceCreIm
        lc345_reverseVowelsofaString lc345 = new lc345_reverseVowelsofaString();
        String ans = lc345.revrseVowel(s);
        System.out.println(ans);
    }
}


// It can also be done via nested loop approach --->
// while (left < right && "aeiouAEIOU".indexOf(ch[left]) == -1) {
// left++;
// }
// while (left < right && "aeiouAEIOU".indexOf(ch[right]) == -1) {
// right--;
// }
// char tmp = ch[left];
// ch[left] = ch[right];
// ch[right] = tmp;
// right--;
// left++;
