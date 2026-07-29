public class lc58__lastLengthOfWord{
    int lastLengthWord(String s){
        String str[] = s.trim().split("\\s+");
        // char ch[] = str[str.length-1].toCharArray();
        // return ch.length;
        return str[str.length - 1].length();
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        lc58__lastLengthOfWord lc58 = new lc58__lastLengthOfWord();
        int res = lc58.lastLengthWord(s);
        System.out.println(res);
    }
}