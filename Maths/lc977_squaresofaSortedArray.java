import java.util.Arrays;

public class lc977_squaresofaSortedArray {
    int[] squares(int[] nums){
        int[] ans = new int[nums.length];
        int idx = 0;
        for(int num : nums){
            ans[idx++] = num*num;
        }
        Arrays.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        lc977_squaresofaSortedArray lc977 = new lc977_squaresofaSortedArray();
        System.out.println(Arrays.toString(lc977.squares(nums)));
    }
}
