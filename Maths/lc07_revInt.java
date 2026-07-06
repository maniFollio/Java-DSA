public class lc07_revInt {
    int revInt(){
        int n = 123;
        int rev = 0;

        while(n != 0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n = n/10;
        }

        // System.out.println("Original Number = "+og);
        // System.out.println("Reverse of entered Number = "+rev);
        return rev;
    }
    public static void main(String[] args) {
        lc07_revInt r1 = new lc07_revInt();
       System.out.println(r1.revInt());
    }
}
