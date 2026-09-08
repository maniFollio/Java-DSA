public class lc3870_countCommasinRange {
    int countComma(int num){
        if(num <= 999){
            return 0;
        }
        return  num - 999;
    }
    public static void main(String[] args) {
        int num = 1002;
        lc3870_countCommasinRange lc3870 = new lc3870_countCommasinRange();
        int res = lc3870.countComma(num);
        System.out.println(res);
    }
}
