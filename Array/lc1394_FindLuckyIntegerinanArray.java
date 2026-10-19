import java.util.HashMap;

public class lc1394_FindLuckyIntegerinanArray {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int large = -1;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            int freq = map.get(num);
            if (freq == num) {
                large = Math.max(large, num);
            }
        }
        return large;
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 2, 3, 4 };
        int[] arr = { 2, 2, 2, 3, 3 };
        lc1394_FindLuckyIntegerinanArray lc1394 = new lc1394_FindLuckyIntegerinanArray();
        System.out.println(lc1394.findLucky(arr));
    }
}
