import java.util.Arrays;

public class lc3718_smallestMissingMultipleofK {
    public int missingMultiple(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0) {
                arr[count++] = nums[i];
            }
        }
        if (arr.length <= 1) {
            return k;
        }
        Arrays.sort(arr);
        int cpy = k;
        for (int i = 0; i < count - 1; i++) {
            if (arr[i] > cpy) {
                System.out.println(cpy);
                return cpy;
            }
            cpy += k;
        }
        int res = arr[arr.length - 1] + k;
        // System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 2, 3, 4, 6 };
        int k = 2;
        // int[] nums = { 1, 4, 7, 10, 15 };
        // int k = 5;
        lc3718_smallestMissingMultipleofK lc3718 = new lc3718_smallestMissingMultipleofK();
        int ans = lc3718.missingMultiple(nums, k);
        System.out.println(ans);
    }
}
