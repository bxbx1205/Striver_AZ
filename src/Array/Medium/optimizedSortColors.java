package Array.Medium;

import java.util.Arrays;

public class optimizedSortColors {
    static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
    static void swap(int[] nums, int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
    static void sortColors(int[] nums){
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                swap(nums,count++,i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                swap(nums,count++,i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==2){
                swap(nums,count++,i);
            }
        }
        System.out.println(Arrays.toString(nums));
        return;
    }
}
