import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class lc15_3Sum {
    List<List<Integer>> threeSum(int[] num) {
        // List<Integer> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            int left = i + 1;
            int right = num.length - 1;
            while (left < right) {
                int sum = num[i] + num[left] + num[right];
                if (sum == 0) {
                    set.add(Arrays.asList(num[i], num[left], num[right]));
                    left++;
                    right--;
                } else if ( sum < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        // int[] nums = { 0,0,0 };
        // int[] nums = { 0, 1, 1 };
        lc15_3Sum lc15 = new lc15_3Sum();
        // lc15.threeSum(nums);
        System.out.println(lc15.threeSum(nums));
    }
}

// List<int[]> list = new ArrayList<>();
// int n = num.length;
// int count = 0;
// for (int i = 1; i < n; i++) {
// int[] arr = new int[3];
// for (int k = 2; k < n; k++) {
// if (num[i - 1] + num[i] + num[k] == 0) {
// arr[0] = num[i-1];
// arr[1] = num[i];
// arr[2] = num[k];
// list.add(arr);
// count++;
// }
// }
// }
// for(int[] newArr: list){
// System.out.println(Arrays.toString(newArr));
// }
