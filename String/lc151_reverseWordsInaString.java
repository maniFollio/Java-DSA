public class lc151_reverseWordsInaString {
    String revrseWord(String s) {
        String[] words = s.trim().split("\\s+");
        int right = words.length - 1;
        int left = 0;
        while(left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        String ans = String.join(" ", words);
        return ans;
        // for (int i = 0; i < words.length; i++) {
        //     System.out.print(words[i] + "  ");

        // }
        // System.out.println("\n" + words.length);
        // System.out.println(ans);
    }

    public static void main(String[] args) {
        String s = "For Sure Use ChatGPT";
        lc151_reverseWordsInaString lc151 = new lc151_reverseWordsInaString();
        System.out.println(lc151.revrseWord(s));
    }
}
