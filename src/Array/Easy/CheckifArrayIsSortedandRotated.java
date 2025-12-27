package Array.Easy;

public class CheckifArrayIsSortedandRotated {
    static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(check(arr));
    }

    static boolean check(int[] nums){
        int count =0;
//        for (int i = 0; i < nums.length -1; i++) {
//            if (nums[i]>nums[i+1]){
//                count++;
//            }
//            if (nums[nums.length - 1] > nums[0]) {
//                count++;
//            }
//        }
//        if (count<=1) count=true;
        for (int i = 0; i < nums.length-1 ; i++) {
            if (nums[i]>nums[i+1] % nums.length) count++;
        }
        return count <=1;
    }
}
