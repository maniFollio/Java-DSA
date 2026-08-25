import java.util.Stack;

public class lc394_decodeString {
    String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                st.push(s.charAt(i));
            } else {
                StringBuilder temp = new StringBuilder();
                while (!st.isEmpty() && st.peek() != '[') {
                    temp.append(st.pop());
                }
                temp.reverse();
                st.pop();
                StringBuilder num = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    num.insert(0, st.pop());
                }
                int number = Integer.parseInt(num.toString());
                StringBuilder repeat = new StringBuilder();
                for (int j = 0; j < number; j++) {
                    repeat.append(temp);
                }
                for (char ch : repeat.toString().toCharArray()) {
                    st.push(ch);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        res.reverse();
        return res.toString();
    }

    public static void main(String[] args) {
        // String str = "3[a]2[bc]";
        String str = "3[a2[c]]";
        lc394_decodeString lc394 = new lc394_decodeString();
        String ans = lc394.decodeString(str);
        System.out.println(ans);
    }
}
