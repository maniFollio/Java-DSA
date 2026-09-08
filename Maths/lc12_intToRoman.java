public class lc12_intToRoman {
    public String intToRoman(int num) {
        String[] m = { "", "M", "MM", "MMM" };
        String[] c = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] x = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] i = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

        String m1 = m[(num / 1000)];
        String c1 = c[(num % 1000) / 100];
        String x1 = x[(num % 100) / 10];
        String i1 = i[(num % 10)];

        String ans = m1 + c1 + x1 + i1;
        return ans;
    }
    public static void main(String[] args) {
        int num = 3749;
        lc12_intToRoman lc12 = new lc12_intToRoman();
        System.out.println(lc12.intToRoman(num));
    }
}
