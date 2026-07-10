import java.util.HashSet;

public class CountVowel {
    void a2zVowel(String s) {

        int count = 0;
        s.toLowerCase();
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);

        // For small data-set we should avoid using data structures.
        // HashSet<Character> set = new HashSet<>();
        // set.add('a');
        // set.add('e');
        // set.add('i');
        // set.add('o');
        // set.add('u');
        // s.toLowerCase();
        // int count = 0;
        // for(int i = 0; i < s.length(); i++){
        // if(set.contains(s.charAt(i))){
        // count++;
        // }
        // }
        // System.out.println(count);
    }

    public static void main(String[] args) {
        // String s = "Manish";
        String s = "Rishit";
        CountVowel cv = new CountVowel();
        cv.a2zVowel(s);
    }
}
