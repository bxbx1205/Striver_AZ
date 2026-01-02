package Array.Medium;

import java.util.ArrayList;

public class Printsubarraywithmaximumsubarray {
    static void main(String[] args) {
        int[] arr = {1, 2, 5, -7, 2, 6};
        System.out.println(findSubarray(arr));
    }
    static public ArrayList<Integer> findSubarray(int nums[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int max =nums[0];
        int sum =0;

        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;

        for (int i = 0; i < nums.length; i++) {
            if(sum==0){
                start=i;
            }

            sum+=nums[i];

            if (sum>max){
                max=sum;
                ansStart=start;
                ansEnd=i;
            }
            if (sum<0){
                sum=0;

            }
        }

        for (int i = ansStart; i <=ansEnd ; i++) {
            al.add(nums[i]);
        }


        return al;

    }
}
