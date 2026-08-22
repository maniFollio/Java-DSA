import java.util.Stack;

public class lc682_baseballGame {

    int baseballGame(String[] operation) {
        Stack<String> stack = new Stack<>();
        Stack<String> copyStack = new Stack<>();
        int n = operation.length;
        int value;
        String score;
        String choice;
        int x, y;
        for (int i = 0; i < n; i++) {
            if (!operation[i].equals("+") &&
                    !operation[i].equals("C") &&
                    !operation[i].equals("D")) {
                stack.push(operation[i]);
                copyStack.push(operation[i]);
            } else {
                choice = operation[i];
                switch (choice) {
                    case "+":
                        x = Integer.parseInt(stack.pop());
                        y = Integer.parseInt(stack.peek());
                        stack.push("" + x);
                        value = x + y;
                        score = "" + value;
                        stack.push(score);
                        copyStack.push(score);
                        break;
                    case "C":
                        stack.pop();
                        copyStack.pop();
                        break;
                    case "D":
                        x = Integer.parseInt(stack.peek());
                        value = 2 * x;
                        score = "" + value;
                        stack.push(score);
                        copyStack.push(score);
                        break;
                }
            }
        }
        int sum = 0;
        while (!copyStack.isEmpty()) {
            int temp = Integer.parseInt(copyStack.pop());
            sum += temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] op = { "5", "2", "C", "D", "+" };
        // String[] op = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        lc682_baseballGame lc682 = new lc682_baseballGame();
        int sum = lc682.baseballGame(op);
        System.out.println(sum);
    }
}