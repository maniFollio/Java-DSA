import java.util.Arrays;

public class lc15_3Sum {
    int[] threeSum(int[] num) {
        // Arrays.sort(num);
        int[] ans = new int[3];
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                for (int k = i+3; k < num.length; k++) {
                    if(num[i] + num[j]+ num[k] == 0){
                        return new int[] {num[i], num[j], num[k]};
                    }
                }
            }

        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        lc15_3Sum lc15 = new lc15_3Sum();
        int[] res = lc15.threeSum(nums);
        System.out.println(Arrays.toString(res));
    }
}
