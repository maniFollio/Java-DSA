import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc448_findAllNumbersDisappearedinanArray {
    public void findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int i ;
        for (i = 0; i < nums.length; i++) {
            if(nums[i] != i+1){
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        lc448_findAllNumbersDisappearedinanArray lc448 = new lc448_findAllNumbersDisappearedinanArray();
        lc448.findDisappearedNumbers(arr);
    }
}
