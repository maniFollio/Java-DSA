import java.util.Stack;

public class lc150_evaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int value = 0;
        String result = "";
        String p = "";
        int x, y;
        String choice;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] != "+" && tokens[i] != "-" && tokens[i] != "*" && tokens[i] != "/") {
                stack.push(tokens[i]);
                continue;
            } else {
                choice = tokens[i];
            }
            switch (choice) {
                case "+":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x + y;
                    result = p + value;
                    stack.push(result);
                    break;
                case "-":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y - x;
                    result = p + value;
                    stack.push(result);
                    break;
                case "*":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x * y;
                    result = p + value;
                    stack.push(result);
                    break;
                case "/":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y / x;
                    result = p + value;
                    stack.push(result);
                    break;
                default:
                    continue;
            }
        }
        return Integer.parseInt(stack.peek());
    }

    public static void main(String[] args) {
        // String[] token = { "2", "1", "+", "3", "*" };
        String[] token = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        lc150_evaluateReversePolishNotation lc150 = new lc150_evaluateReversePolishNotation();
        int ans = lc150.evalRPN(token);
        System.out.println(ans);
    }
}
