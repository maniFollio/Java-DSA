public class firstPrg {
    void abc(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + "  ");
        abc(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        firstPrg obj = new firstPrg();
        obj.abc(n);
    }
}
