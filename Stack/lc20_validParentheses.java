import java.util.Stack;

public class lc20_validParentheses {
    boolean validParentheses(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.size() == 0) {
                    return false;
                }
                if ((st.peek() == '(' && ch == ')') ||
                        (st.peek() == '{' && ch == '}') ||
                        (st.peek() == '[' && ch == ']')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()[]{}";
        lc20_validParentheses lc20 = new lc20_validParentheses();
        System.out.println(lc20.validParentheses(str));
    }
}
