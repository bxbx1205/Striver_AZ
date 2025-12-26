package Hashing;
import java.util.*;

public class elementswithmaxFrequency {
    static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(arr));
    }

    static public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }

            int maxFreq = 0;
            for (int freq : map.values()) {
                if (freq > maxFreq) {
                    maxFreq = freq;
                }
            }

            for (int freq : map.values()) {
                if (freq == maxFreq) {
                    answer = answer + freq;
                }
            }



        return answer;
    }

}
