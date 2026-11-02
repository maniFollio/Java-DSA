public class lc2574_LeftandRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        // Calculate the total sum of the array first
        for (int num : nums) {
            rightSum += num;
        }

        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            // Right sum for index i excludes the current element
            rightSum -= nums[i];

            // Calculate absolute difference
            answer[i] = Math.abs(leftSum - rightSum);

            // Current element becomes part of the left sum for the next index
            leftSum += nums[i];
        }

        return answer;
    }
}
