package Array.Medium;

import java.util.Arrays;

public class nextPermutation {

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    static void nextPermutation(int[] nums) {
        int n =nums.length;
        int index=-1;
        for (int i = n-2; i >=0 ; i--) {
            if (nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }

        if (index==-1){
            reverse(nums,0,n-1);
            return;
        }
        for (int i = n-1; i >=index ; i--) {
            if (nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }
        reverse(nums,index+1,n-1);

        return;
    }
}
