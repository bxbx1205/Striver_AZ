package Array.Hard;
import java.util.*;

public class threeSUM {

    public static void main(String[] args) {
        int[] arr = {0, 1, 1};
        System.out.println(threeSum(arr));
    }

    static public List<List<Integer>> threeSum(int[] nums) {

        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            HashSet<Integer> hashset = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int third = -(nums[i] + nums[j]);

                if (hashset.contains(third)) {

                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);

                    Collections.sort(temp);
                    set.add(temp);
                }

                hashset.add(nums[j]);
            }
        }

        return new ArrayList<>(set);
    }
}
