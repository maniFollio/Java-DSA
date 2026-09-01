public class lc1903_largestOddNumberinString {
    String largestOddNumber(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 != 0) {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        // String s = "52";
        String s = "4206";
        lc1903_largestOddNumberinString lc1903 = new lc1903_largestOddNumberinString();
        String res = lc1903.largestOddNumber(s);
        System.out.println(res);
    }
}

// int num = Integer.parseInt(s);
// while (num != 0) {
// if ((num % 2) != 0) {
// return "" + num;
// }
// num = num / 10;
// }
// return "";
