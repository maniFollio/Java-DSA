import java.util.HashMap;

public class lc137_SingleNumberII {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 2 };
        lc137_SingleNumberII lc137 = new lc137_SingleNumberII();
        System.out.println(lc137.singleNumber(arr));
    }

}
