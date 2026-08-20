import java.util.Arrays;
import java.util.Stack;

public class lc739_dailyTemperatures {
    int[] dailyTemp(int[] temperature) {
        Stack<Integer> stack = new Stack<>();
        int n = temperature.length;
        int arr[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperature[i] >= temperature[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                arr[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] temp = { 73, 74, 75, 71, 69, 72, 76, 73 };
        lc739_dailyTemperatures lc739 = new lc739_dailyTemperatures();
        int[] ans = lc739.dailyTemp(temp);
        System.out.println(Arrays.toString(ans));
    }
}
