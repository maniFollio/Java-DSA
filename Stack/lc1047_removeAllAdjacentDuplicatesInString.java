import java.util.Stack;

public class lc1047_removeAllAdjacentDuplicatesInString {
    String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 1;
        stack.push(s.charAt(i - 1));
        while (i < s.length()) {
            if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        lc1047_removeAllAdjacentDuplicatesInString lc1047 = new lc1047_removeAllAdjacentDuplicatesInString();
        String s = ("abbaca");
        String ans = lc1047.removeDuplicates(s);
        System.out.println(ans);
    }
}
