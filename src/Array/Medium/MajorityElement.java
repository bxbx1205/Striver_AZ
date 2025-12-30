package Array.Medium;

public class MajorityElement {
    static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] nums) {
        int mFirst=0;
        int majority;
        int mSecond=0;
        int first = nums[0];
        int second =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=first){
                second=nums[i];
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==first){
                mFirst++;
            }
            else {
                mSecond++;
            }
        }
            if (mFirst>mSecond){
                majority = first;
            }
            else{  majority =second;}

        return majority;
    }
}
