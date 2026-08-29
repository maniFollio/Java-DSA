import java.util.Arrays;
import java.util.Stack;

public class lc503_nextGreaterElementII {
    int[] nextGreaterElementII(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] arrCopy = new int[nums.length * 2];
        int[] ans = new int[nums.length * 2];
        System.arraycopy(nums, 0, arrCopy, 0, nums.length);
        System.arraycopy(nums, 0, arrCopy, nums.length, nums.length);
        for (int i = arrCopy.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arrCopy[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arrCopy[i]);
        }
        return Arrays.copyOfRange(ans, 0, ans.length / 2);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 3 };
        lc503_nextGreaterElementII lc503 = new lc503_nextGreaterElementII();
        int[] ans = lc503.nextGreaterElementII(nums);
        System.out.println(Arrays.toString(ans));
    }
}
