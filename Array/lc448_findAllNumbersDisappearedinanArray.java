import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc448_findAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                arr[idx++] = nums[i - 1];
            }
        }
        arr[idx++] = nums[nums.length - 1];
        int count = 1;
        int i = 0;
        while (count <= arr.length) {
            if (i < idx && arr[i] == count) {
                i++;
            } else {
                list.add(count);
            }
            count++;
        }
        return list;
    }

    public static void main(String[] args) {
        // int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int[] arr = { 1, 1 };
        lc448_findAllNumbersDisappearedinanArray lc448 = new lc448_findAllNumbersDisappearedinanArray();
        System.out.println(lc448.findDisappearedNumbers(arr));
    }
}
