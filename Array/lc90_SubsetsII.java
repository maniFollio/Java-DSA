import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc90_SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    void backTrack(int start, int[] nums, ArrayList<Integer> current, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            current.add(nums[i]);
            backTrack(i + 1, nums, current, ans);
            current.remove(current.size() - 1);
        }
    }
}
