public class noreverse {
    static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    static int reverse(int x){
        int rev = 0;

        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return rev;
    }
}


