public class lc443_compressString {
    void compressString(char[] chars) {
        int idx = 0;
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            char ch = chars[i];
            while (i < n && chars[i] == ch) {
                i++;
                count++;
            }
            if (count == 1) {
                chars[idx++] = ch;
            } else {
                chars[idx++] = ch;
                String s = Integer.toString(count);
                for (char c : s.toCharArray()) {
                    chars[idx++] = c;
                }
            }
            i--;
        }
        for (int i = 0; i < idx; i++) {
            System.out.print(chars[i]);
        }
    }

    public static void main(String[] args) {
        char[] ch = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

        lc443_compressString lc443 = new lc443_compressString();
        lc443.compressString(ch);
    }
}
