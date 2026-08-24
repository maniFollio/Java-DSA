import java.util.Stack;

public class lc844_backspaceStringCompare {
    boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        int n = 0;
        while (n < s.length()) {
            if (s.charAt(n) == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(s.charAt(n));
            }
            n++;
        }
        n = 0;
        while (n < t.length()) {
            if (t.charAt(n) == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack2.push(t.charAt(n));
            }
            n++;
        }
        System.out.println(stack1);
        System.out.println(stack2);
        return stack1.equals(stack2);
    }

    public static void main(String[] args) {
        // String s = "ab#c";
        // String t = "ad#c";
        // String s = "ab##";
        // String t = "c#d#";
        String s = "a#c";
        String t = "b";
        lc844_backspaceStringCompare lc844 = new lc844_backspaceStringCompare();
        boolean res = lc844.backspaceCompare(s, t);
        System.out.println(res);
    }
}
