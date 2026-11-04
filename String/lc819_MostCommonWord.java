import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lc819_MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        // 1. Convert banned array to a HashSet for O(1) lookup times
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        // 2. Normalize paragraph: switch to lowercase and replace all punctuation/non-words with spaces
        // \\W+ matches one or more non-word characters (spaces, commas, periods, exclamation marks, etc.)
        String[] words = paragraph.toLowerCase().split("\\W+");
        
        Map<String, Integer> wordCounts = new HashMap<>();
        String mostCommon = "";
        int maxCount = 0;
        
        // 3. Count frequencies of valid, non-banned words
        for (String word : words) {
            // Edge case: splitting can sometimes leave empty strings if text starts/ends with punctuation
            if (word.isEmpty() || bannedSet.contains(word)) {
                continue;
            }
            
            // Increment the count in the map
            int currentCount = wordCounts.getOrDefault(word, 0) + 1;
            wordCounts.put(word, currentCount);
            
            // 4. Update the most common word on the fly
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostCommon = word;
            }
        }
        
        return mostCommon;
}
