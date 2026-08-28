import java.util.Arrays;
import java.util.Stack;

public class lc496_nextGreaterElementI {
    int[] nextGreaterElementI(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        int[] temp = new int[nums2.length];
        for (int i = nums2.length-1; i >=0; i--) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                temp[i] = -1;
            } else {
                temp[i] = st.peek();
            }
            st.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int idx = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    idx = j;
                    break;
                }
            }
            ans[i] = temp[idx];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        lc496_nextGreaterElementI lc496 = new lc496_nextGreaterElementI();
        int[] res = lc496.nextGreaterElementI(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
