package Array.Hard;
import java.util.*;

public class threeSUM {
    static void main(String[] args) {
        int[] arr = {0,1,1};
        System.out.println(fourSum(arr,0));
    }
    static public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i+1; j < nums.length ; j++) {
                List<Integer> sub = new ArrayList<>();
                int current = nums[j];
                int needed = target- nums[i]-current;

                if (set.contains(needed)){
                    sub.add(nums[i]);
                    sub.add(current);
                    sub.add(needed);

                    ans.add(sub);
                }
                set.add(current);
            }
        }

        return ans;
    }
}
