public class lc415_addStrings {
    public String addStrings(String num1, String num2) {

        int val1 = 0;
        for (int i = 0; i < num1.length(); i++) {
            int n1 = num1.charAt(i) - '0';
            val1 = val1 * 10 + n1;
        }
        int val2 = 0;
        for (int i = 0; i < num2.length(); i++) {
            int n2 = num2.charAt(i) - '0';
            val2 = val2 * 10 + n2;
        }
        int total = val1 + val2;

        return "" + total;
    }

    public static void main(String[] args) {
        String num1 = "456";
        String num2 = "77";
        lc415_addStrings lc415 = new lc415_addStrings();
        System.out.println(lc415.addStrings(num1, num2));
    }
}
