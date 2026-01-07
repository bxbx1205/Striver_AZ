package Array.Medium;

import java.util.*;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        System.out.println(subarraySum(arr,3));
    }
    static public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if (map.containsKey(sum-k)){
                count+= map.get(sum-k);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return count;
    }
}
