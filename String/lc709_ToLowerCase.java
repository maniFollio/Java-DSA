public class lc709_ToLowerCase {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch <= 'Z' && ch >= 'A') {
                ch = (char) (ch + 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "HeLLo";
        lc709_ToLowerCase lc709 = new lc709_ToLowerCase();
        System.out.println(lc709.toLowerCase(str));
    }
}
