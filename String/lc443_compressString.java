public class lc443_compressString {
    void compressString(char[] ch) {

        // String s = "";
        StringBuilder s = new StringBuilder();
        int n = ch.length;
        int count = 1;
        for (int i = 1; i < n; i++) {

            if (ch[i] == ch[i - 1]) {
                count++;
            } else{
                count = 1;
            }
            
            // if (count == 1) {
            //     s.append(ch[i]);
            // } else {
            //     s.append(ch[i]);
            //     s.append(count);
            // }
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        char[] ch = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

        lc443_compressString lc443 = new lc443_compressString();
        lc443.compressString(ch);
    }
}
