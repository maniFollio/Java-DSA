import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc347_topKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] result = new int[k];
        int count = 0;
        for (int i = bucket.length - 1; i >= 0 && count < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[count] = num;
                    count++;
                    if (count == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // int[] arr = { 1, 1, 1, 2, 2, 3 };
        int[] arr = { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2 };
        lc347_topKFrequentElement lc347 = new lc347_topKFrequentElement();
        int[] ans = lc347.topKFrequent(arr, 2);
        System.out.println(Arrays.toString(ans));
    }
}
