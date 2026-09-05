import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class lc18_4Sum {
    List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                HashSet<Integer> set = new HashSet<>();
                for (int k = j + 1; k < nums.length; k++) {
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long last = (long) target - sum;
                    if (last <= Integer.MIN_VALUE && last >= Integer.MAX_VALUE && set.contains((int)last)) {
                        ArrayList<Integer> curr = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], (int) last));
                        Collections.sort(curr);
                        ans.add(curr);
                    }
                    set.add(nums[k]);
                }
            }
        }
        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        lc18_4Sum lc18 = new lc18_4Sum();
        System.out.println(lc18.fourSum(nums, target));
    }
}
