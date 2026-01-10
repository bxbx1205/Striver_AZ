package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals ={
                {1,3},
                {2,6},
                {8,10},
                {15,18},
        };

        System.out.println(Arrays.deepToString(merge(intervals)));

    }

    static public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start=intervals[0][0];
        int end=intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                ans.add(new int[]{start, end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
             ans.add(new int[]{start, end});

        return ans.toArray(new int[ans.size()][]);
    }
}
