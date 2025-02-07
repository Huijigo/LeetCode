import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] res = solution.merge()
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a1,a2)->{
            return a1[0] - a2[0];
        });
        List<int[]> res = new ArrayList<>();
        int begin = intervals[0][0],end = intervals[0][1];
        for(int i = 1; i < intervals.length;i++){
            if(intervals[i][0] <= end){
                end = intervals[i][1] > end? intervals[i][1]:end;
            }else{
                res.add(new int[]{begin,end});
                begin = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res.add(new int[]{begin,end});
        int[][] res_all = new int[res.size()][2];
        return res.toArray(res_all);
    }
}