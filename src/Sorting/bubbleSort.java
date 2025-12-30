package Sorting;

import java.util.Arrays;

public class bubbleSort {
    static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSorted=false;
                }
            }
            if (isSorted){
                break;
            }
        }
    }
}
