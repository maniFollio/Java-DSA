import java.util.HashSet;

public class lc1832_CheckiftheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}
