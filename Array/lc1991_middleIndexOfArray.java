public class lc1991_middleIndexOfArray {
    int middleOfArray(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = nums[0];
        suffix[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }
        // for (int i = 0; i < nums.length; i++) {
        // System.out.print(prefix[i] + " ");
        // }
        // System.out.println("");
        // for (int i = 0; i < nums.length; i++) {
        // System.out.print(suffix[i] + " ");
        // }
        for (int i = 0; i < nums.length; i++) {
            if (prefix[i] == suffix[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 3, -1, 8, 4 };
        int[] nums = { 1, -1, 4 };
        lc1991_middleIndexOfArray lc1991 = new lc1991_middleIndexOfArray();
        int ans = lc1991.middleOfArray(nums);
        System.out.println(ans);
    }
}
