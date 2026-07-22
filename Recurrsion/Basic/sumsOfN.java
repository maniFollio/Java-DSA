public class sumsOfN {
    int totalSums(int n){
        if(n==1){
            return 1;
        }
        return n + totalSums(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        sumsOfN obj = new sumsOfN();
        int res = obj.totalSums(n);
        System.out.println(res);
    }
}
