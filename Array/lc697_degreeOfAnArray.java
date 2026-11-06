    import java.util.HashMap;
import java.util.Map;

public class lc697_degreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        // Track the first occurrence index of each element
        Map<Integer, Integer> firstSeen = new HashMap<>();
        // Track the total frequency count of each element
        Map<Integer, Integer> counts = new HashMap<>();
        
        int degree = 0;
        int minLength = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            // Record the first time we see this number
            if (!firstSeen.containsKey(num)) {
                firstSeen.put(num, i);
            }
            
            // Update the frequency count
            int currentCount = counts.getOrDefault(num, 0) + 1;
            counts.put(num, currentCount);
            
            // Calculate potential subarray length for the current element
            int currentLength = i - firstSeen.get(num) + 1;
            
            // If we find a higher degree, reset maximum degree and update length
            if (currentCount > degree) {
                degree = currentCount;
                minLength = currentLength;
            } 
            // If the frequency matches the current highest degree, pick the shorter length
            else if (currentCount == degree) {
                minLength = Math.min(minLength, currentLength);
            }
        }
        
        return minLength;
    }
}
