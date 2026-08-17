public class lc8_stringToInteger {
    int stringToInt(String s) {
        int i = 0;
        int sign = 1;
        int result = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        while( i < s.length() && Character.isDigit(s.charAt(i)) ){
            result = (result * 10) + (s.charAt(i) - '0');
            i++;
        }

        // System.out.println(result);
        return result * sign;
    }

    public static void main(String[] args) {
        String s = "    421";
        lc8_stringToInteger lc8 = new lc8_stringToInteger();
        int res = lc8.stringToInt(s);
        System.out.println(res);
    }
}
