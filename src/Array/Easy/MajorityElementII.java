package Array.Easy;
import java.util.*;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {3,2,3,3,2,3};
        System.out.println(majorityElement(arr));
    }

    static  List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (map.containsKey(current)){
                map.put(current, map.getOrDefault(current,1)+1);
            }
            else {
                map.put(current,1);
            }


        }
//        System.out.println(map);
        for (int key: map.keySet()){
            int votes = map.get(key);
            if(votes > nums.length/3){
                list.add(key);
            }
        }

        return list;
    }
}
