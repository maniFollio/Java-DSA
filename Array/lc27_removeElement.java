public class lc27_removeElement {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int idx = 0;
        for(int i =0; i < len; i++){
            if(nums[i] != val){
                nums[idx++] = nums[i];
            }
        }
        return idx; 
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        int val = 3;
        lc27_removeElement lc27 = new lc27_removeElement();
        int res = lc27.removeElement(arr, val);
        System.out.println(res);
    }
}
