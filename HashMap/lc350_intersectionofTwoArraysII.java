// import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class lc350_intersectionofTwoArraysII {
    int[] intersectArrayII(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i])) {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            } else {
                map1.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map1.containsKey(nums2[i])) {
                int xx = map1.get(nums2[i]);
                if (xx > 0) {
                    if (map2.containsKey(nums2[i])) {
                        map2.put(nums2[i], map2.get(nums2[i]) + 1);
                    } else {
                        map2.put(nums2[i], 1);
                    }
                    map1.put(nums2[i], xx - 1);
                }
            }
        }
        int total = 0;
        int idx = 0;
        for (int value : map2.values()) {
            total += value;
        }
        int ans[] = new int[total];
        for (int number : map2.keySet()) {
            int frequency = map2.get(number);

            for (int i = 0; i < frequency; i++) {
                ans[idx++] = number;
            }
        }
        return ans;
        // With the help of Entry DS, which gives key and value.
        // for(Map.Entry<Integer, Integer> entry : map2.entrySet()){
        // int number = entry.getKey();
        // int freq = entry.getValue();
        // for(int i = 0; i < freq; i++){
        // ans[idx] = number;
        // }
        // }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 1 };
        int arr2[] = { 2, 2 };
        lc350_intersectionofTwoArraysII lc350 = new lc350_intersectionofTwoArraysII();
        int[] res = lc350.intersectArrayII(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }
}
