package Array.Medium;

public class maxSubArray {
    static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    static  int maxSubArray(int[] nums) {
        int max =nums[0];
        int sum =0;

        for (int i = 0; i < nums.length; i++) {
            if(nums.length==1){
                return nums[0];
            }
            sum+=nums[i];

            if (sum>max){
                max=sum;
            }
            if (sum<0){
                sum=0;
            }
        }


        return max;
    }
}
