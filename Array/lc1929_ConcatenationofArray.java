public class lc1929_ConcatenationofArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        int idx = 0;
        for (int num : nums) {
            ans[idx++] = num;
        }
        for (int num : nums) {
            ans[idx++] = num;
        }
        return ans;
    }
}
