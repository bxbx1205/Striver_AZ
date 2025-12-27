package Array.Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicatesfromSortedArray {
    static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removedDuplicates(arr));
    }

    static int removedDuplicates(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();


        for (int num : nums) {
            map.put(num, num);
        }
        int index =0;
        for (int value :  map.values()) {
            nums[index] = value;
            index++;
        }
        return nums.length;

        }

    }

