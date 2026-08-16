public class lc231_PowerofTwo {
    boolean powerOfTwo(int n) {
        int multi = 1;
        if (n <= 0) {
            return false;
        } 
        while(n % 2 == 0){
            n /= 2;
        }
        return n==1;
    }

    public static void main(String[] args) {
        int n = 32;
        lc231_PowerofTwo lc231 = new lc231_PowerofTwo();
        boolean bool = lc231.powerOfTwo(n);
        System.out.println(bool);
    }
}

// Will hit TLE
        // while (multi <= n) {
        //     if (multi == n) {
        //         return true;
        //     }
        //     multi *= 2;
        // }
        // return false;
