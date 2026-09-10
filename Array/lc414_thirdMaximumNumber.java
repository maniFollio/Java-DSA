import java.util.ArrayList;
import java.util.TreeSet;

public class lc414_thirdMaximumNumber {
    int thirdMaximumNumber(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
            set.add(num);
        }
        for (Integer val : set) {
            list.add(val);
        }
        if (list.size() >= 3) {
            // int t = list.size() - 3;
            return list.get(list.size() - 3);
        }
        return max;
        // System.out.println(set);
        // System.out.println(list);
    }

    public static void main(String[] args) {
        lc414_thirdMaximumNumber lc414 = new lc414_thirdMaximumNumber();
        // int[] nums = { 3, 3, 2, 1 };
        int[] nums = { 3, 3, 2, 1, 4, 5, 6, 7, 8, 9, 10 };
        int ans = lc414.thirdMaximumNumber(nums);
        System.out.println(ans);
    }
}
