import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc347_topKFrequentElement {
    void frequentElement(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int key : nums) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int idx = 0;
        int arr[] = new int[map.size()];
        for (int count : map.keySet()) {
            if (map.get(count) >= k) {
                arr[idx++] = map.get(count);
            }
        }
        Arrays.sort(arr);
        int n = arr.length;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == arr[n-1]){
                list.add(entry.getKey());
            }
            n--;
        }
        int newArr[] = new int[k];
        for(int i =0; i < k; i++){
            newArr[i]=list.get(i);
        }
        for (int i = 0; i < k; i++) {
            System.out.print(newArr[i] + "   ");
        }
    }
    public static void main(String[] args) {
        // int[] arr = { 1, 1, 1, 2, 2, 3 };
        int[] arr = { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2 };
        lc347_topKFrequentElement lc347 = new lc347_topKFrequentElement();
        lc347.frequentElement(arr, 2);
    }
}
