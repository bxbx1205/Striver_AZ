package Array.Medium;

import java.util.Arrays;

public class SortColors {
    static void main(String[] args) {
        int[] arr = {2,2,1,1,0};
        sortColors(arr);
    }
    static void sortColors(int[] nums) {
        int countZero =0;
        int countOne =0;
        int countTwo=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0) countZero++;
            else if (nums[i]==1) {
                countOne++;
            }
            else {
                countTwo++;
            }
        }
        System.out.println(countZero +"" + countOne +""+ countTwo);
        int index=0;
        for (int i = 0; i < countZero; i++) {
            nums[index]=0;
            index++;
        }

        for (int i = 0; i < countOne; i++) {
            nums[index]=1;
            index++;
        }


        for (int i=index; index < nums.length; index++) {
            nums[index]=2;

        }

        System.out.println(Arrays.toString(nums));
        return;
    }
}
