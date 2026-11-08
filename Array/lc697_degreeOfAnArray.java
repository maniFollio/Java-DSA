import java.util.HashMap;
import java.util.Map;

public class lc697_degreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> firstSeen = new HashMap<>();
        Map<Integer, Integer> counts = new HashMap<>();
        int degree = 0;
        int minLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!firstSeen.containsKey(num)) {
                firstSeen.put(num, i);
            }
            int currentCount = counts.getOrDefault(num, 0) + 1;
            counts.put(num, currentCount);
            int currentLength = i - firstSeen.get(num) + 1;
            if (currentCount > degree) {
                degree = currentCount;
                minLength = currentLength;
            } else if (currentCount == degree) {
                minLength = Math.min(minLength, currentLength);
            }
        }
        return minLength;
    }
}
