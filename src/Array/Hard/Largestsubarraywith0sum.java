package Array.Hard;

import java.util.HashMap;

public class Largestsubarraywith0sum {
    static void main(String[] args) {
        int[] arr = {1, 0, -4, 3, 1, 0};
        System.out.println(maxLength(arr));
    }

    static int maxLength(int[] nums){
        int sum=0;
        int maxLength= 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if (sum == 0) {
                maxLength = i + 1;
            }


            if (map.containsKey(sum)){
                int length=i-map.get(sum);
                maxLength=Math.max(length,maxLength);
            }
            else map.put(sum,i);
        }

        return maxLength;
    }
}
