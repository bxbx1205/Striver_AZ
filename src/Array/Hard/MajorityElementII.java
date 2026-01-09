package Array.Hard;

import java.util.*;

public class MajorityElementII {

    public static void main(String[] args) {
        MajorityElementII obj = new MajorityElementII();

        int[] nums = {1, 2, 3, 1, 1, 2, 2};
        List<Integer> result = obj.majorityElement(nums);

        System.out.println(result);
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int candidate1 = 0, candidate2 = 0;
        int vote1 = 0, vote2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                vote1++;
            } else if (num == candidate2) {
                vote2++;
            } else if (vote1 == 0) {
                candidate1 = num;
                vote1 = 1;
            } else if (vote2 == 0) {
                candidate2 = num;
                vote2 = 1;
            } else {
                vote1--;
                vote2--;
            }
        }

        vote1 = 0;
        vote2 = 0;

        for (int num : nums) {
            if (num == candidate1) vote1++;
            else if (num == candidate2) vote2++;
        }

        int limit = nums.length / 3;

        if (vote1 > limit) list.add(candidate1);
        if (vote2 > limit) list.add(candidate2);

        return list;
    }
}
