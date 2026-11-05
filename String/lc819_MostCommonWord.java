import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lc819_MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        String[] words = paragraph.toLowerCase().split("\\W+");
        Map<String, Integer> wordCounts = new HashMap<>();
        String mostCommon = "";
        int maxCount = 0;
        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) {
                continue;
            }
            int currentCount = wordCounts.getOrDefault(word, 0) + 1;
            wordCounts.put(word, currentCount);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostCommon = word;
            }
        }
        return mostCommon;
    }
}
