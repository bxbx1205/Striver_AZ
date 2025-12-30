package Sorting;

import java.util.Arrays;

public class selectionSort {
    static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}
