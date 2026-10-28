import java.util.Arrays;
import java.util.Set;

public class lc645_SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int duplicate = -1;
        int val = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            }
            if (val == nums[i]) {
                val++;
            }
        }
        return new int[] {duplicate, val};
    }    
}
