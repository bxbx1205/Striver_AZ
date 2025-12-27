package Array.Easy;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArraysecond {
    static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] nums) {
        int index = 0;
        int aagewala = 1;

        for (int i = 0; i < nums.length-1 ; i++) {
            if (nums[index]==nums[aagewala]){
                aagewala++;
            }
            else {
                index+=1;
                nums[index]=nums[aagewala];
                aagewala++;
            }
        }
        System.out.println(Arrays.toString(nums));

        return index+1;
    }
}
