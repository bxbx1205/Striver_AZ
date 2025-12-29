package Array.Easy;

public class missinginArray {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(missingNumber(arr));

    }
    static int missingNumber(int[] nums){

        int xor =0;
        for (int i = 0; i <= nums.length; i++) {
            xor=xor^i;
        }

        for (int i = 0; i <nums.length ; i++) {
            xor=xor^nums[i];
        }

        return xor;
    }
}
