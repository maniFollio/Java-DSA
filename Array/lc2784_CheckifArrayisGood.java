public class lc2784_CheckifArrayisGood {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        
        // Base case: minimal valid array is base[1] = [1, 1], length must be >= 2
        if (n < 1) {
            return false;
        }
        
        int[] counts = new int[n + 1];
        
        for (int num : nums) {
            // If any number is out of the bounds [1, n], it's invalid
            if (num < 1 || num > n) {
                return false;
            }
            counts[num]++;
        }
        
        // Numbers 1 to n-1 must appear exactly 1 time
        for (int i = 1; i < n; i++) {
            if (counts[i] != 1) {
                return false;
            }
        }
        
        // The maximum number n must appear exactly 2 times
        return counts[n] == 2;
    }
}
