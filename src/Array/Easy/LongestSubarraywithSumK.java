package Array.Easy;
//remaining this reattempt
import java.util.HashMap;

public class LongestSubarraywithSumK {

    public static int longestSubarrayWithSumK(int[] arr, long k) {

        HashMap<Long, Integer> preSumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: subarray from index 0
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            // Case 2: subarray exists
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Store prefix sum only if not already present
            // (important for longest length)
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        long k = 3;

        System.out.println(longestSubarrayWithSumK(arr, k)); // Output: 3
    }
}
