public class lc11_containerWithMOstWater {
    void containerWater(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int bigContainer = 0;
        while (left < right) {
            int width = right - left;
            int height = Math.min(nums[left], nums[right]);
            int area = width * height;
            bigContainer = Math.max(area, bigContainer);
            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(bigContainer);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        // int[] arr = { 1, 1 };

        lc11_containerWithMOstWater lc11 = new lc11_containerWithMOstWater();
        lc11.containerWater(arr);
    }
}
