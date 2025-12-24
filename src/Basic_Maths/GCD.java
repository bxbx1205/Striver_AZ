public class GCD {
    static void main(String[] args) {
        System.out.println(GCD(4,3));
    }
    static int GCD(int n1, int n2) {
        if (n1 == 0) return n2;
        if (n2 == 0) return n1;

        int big=0;
        int small=0;

        if(n1>n2){
             big =n1;
             small =n2;
        }
        else{
             small =n1;
             big =n2;
        }
        while(small>0){
            if(big%small==0){
                return small;
            }
            small--;
        }
    return 1;
    }
}
