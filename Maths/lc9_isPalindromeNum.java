// Leet Code Question Number 09 Check For Palindrome Number.

public class lc9_isPalindromeNum {

    public boolean palindrome(int num) {

        if (num < 0){
            System.out.print(num + " is not palindrome number, ");
        return false; // Beacuse -121 is smaller than 0 and -121 != 121.
        }

        int original = num;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = (10 * rev) + rem;
            num = num / 10;
        }
        System.out.print(original+" is palindrome number, ");
        return original == rev;
    }

    public static void main(String[] args) {
        lc9_isPalindromeNum p1 = new lc9_isPalindromeNum();
        System.out.println(p1.palindrome(121));
        System.out.println(p1.palindrome(-121));
    }
}
