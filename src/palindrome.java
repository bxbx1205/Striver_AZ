public class palindrome {
    static void main(String[] args) {
        System.out.println(isPalindrome(21));
    }
    static boolean isPalindrome(int n) {
        if (n<0){
            return false;
        }

        int rev=0;
        int og =n;

        while (n!=0){
            rev = rev*10+n%10;
            n=n/10;
        }

        if(og==rev){
            return true;
        }
        return false;
    }
}
