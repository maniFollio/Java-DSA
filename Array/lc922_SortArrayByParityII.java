public class lc922_SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int idx = 0;
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                res[idx] = nums[i];
                idx += 2;
            }
        }
        idx = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                res[idx] = nums[i];
                idx += 2;
            }
        }
        return res;
    }
}