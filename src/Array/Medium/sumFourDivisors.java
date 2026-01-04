package Array.Medium;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class sumFourDivisors {
    static void main(String[] args) {
        int[] arr = {21,4,7};
        System.out.println(sumFourDivisors(arr));
    }
    static public int sumFourDivisors(int[] nums) {
        int total=0;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int count=0;
            int sum=0;

            for (int j = 1; j*j <=n; j++) {



                if (n%j==0){
                    count++;
                    sum+=j;

                    if (n/j!=j){
                        count++;
                        sum+=n/j;
                    }
                }


            }
            if (count==4){
                total+=sum;
            }


        }
        return total;
    }
}
