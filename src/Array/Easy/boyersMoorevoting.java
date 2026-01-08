package Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class boyersMoorevoting {
    static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }

    static public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int candidate1=0;
        int candidate2=0;
        int vote1=0;
        int vote2=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==candidate1){
                vote1++;
            } else if (nums[i]==candidate2) {
                vote2++;
            } else if (vote1==0) {
                candidate1=nums[i];
                vote1=1;
            }
            else if(vote2==0){
                candidate2=nums[i];
                vote2=1;
            }
            else{
                vote1--;
                vote2--;
            }
        }
        int limit = nums.length / 3;
        vote1=vote2=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==candidate1) vote1++;
            else if (nums[i]==candidate2) vote2++;
        }
        if (vote1>limit) list.add(candidate1);
        if (vote2>limit) list.add(candidate2);
        return list;
    }
}
