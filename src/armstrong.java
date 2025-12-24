public class armstrong {
    static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    static boolean isArmstrong(int n) {
        int count =0;
        int og =n;
        int arm=0;

        while(n>0){
            count++;
            n=n/10;
        }
        n=og;

        while (n>0){
            int last = n%10;
           arm= arm+(int)Math.pow(last,count);
            n/=10;

        }

        if (arm==og){
            return true;
        }


        return false;
    }
}
