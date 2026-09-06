public class lc326_PowerofThree {
    boolean powerOf3(int num) {
        if(num <= 0){
            return false;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        lc326_PowerofThree lc326 = new lc326_PowerofThree();
        int n = 0;
        boolean ans = lc326.powerOf3(n);
        System.out.println(ans);
    }
}
