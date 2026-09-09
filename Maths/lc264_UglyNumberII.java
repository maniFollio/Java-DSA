import java.util.ArrayList;
// TLE got hit, it will be solved using DP.
public class lc264_UglyNumberII {
    public int nthUglyNumber(int i) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = 1;
        while (list.size() < i) {
            int n = temp;
            while (n % 2 == 0) {
                n = n / 2;
            }
            while (n % 3 == 0) {
                n = n / 3;
            }
            while (n % 5 == 0) {
                n = n / 5;
            }
            if (n == 1) {
                list.add(temp);
            }
            temp++;
        }
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        lc264_UglyNumberII lc264 = new lc264_UglyNumberII();
        System.out.println(lc264.nthUglyNumber(n));
    }
}
