import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc15_3Sum {
    void threeSum(int[] num) {
        List<int[]> list = new ArrayList<>();
        int n = num.length;
        int count = 0;
        for (int i = 1; i < n; i++) {
            int[] arr = new int[3];
            for (int k = 2; k < n; k++) {
                if (num[i - 1] + num[i] + num[k] == 0) {
                    arr[0] = num[i-1];
                    arr[1] = num[i];
                    arr[2] = num[k];
                    list.add(arr);
                    count++;
                }
            }
        }
        for(int[] newArr: list){
            System.out.println(Arrays.toString(newArr));
        }
        // System.out.println(count);
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        // int[] nums = { 0,0,0 };
        // int[] nums = { 0, 1, 1 };
        lc15_3Sum lc15 = new lc15_3Sum();
        // int[] res = lc15.threeSum(nums);
        // System.out.println(Arrays.toString(res));
        lc15.threeSum(nums);
    }
}
