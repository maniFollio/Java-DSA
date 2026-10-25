public class lc1480_RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        int[] prifix = new int[nums.length];
        prifix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prifix[i] = prifix[i - 1] + nums[i];
        }
        return prifix;
    }
}
