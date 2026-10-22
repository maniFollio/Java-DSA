import java.util.Arrays;
import java.util.HashSet;

public class lc905_SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int idx = 0;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                res[idx++] = nums[i];
                set.add(nums[i]);
            }
        }
        for(int i = 0; i < n; i++){
            if(set.contains(nums[i])){
                continue;
            }
            res[idx++] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        lc905_SortArrayByParity lc905 = new lc905_SortArrayByParity();
        int[] ans = lc905.sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans));
    }
}
