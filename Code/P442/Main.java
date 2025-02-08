import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> res = solution.findDuplicates(new int[]{4,3,2,7,8,2,3,1});
        for(Integer a: res){
            System.out.println(a);
        }
    }
}
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ;i < nums.length; i++){
            while(nums[nums[i] - 1] != nums[i]){
                swap(nums,i,nums[i] - 1);
            }

            if(nums[i] == nums[nums[i] -1] && i != (nums[i] - 1)){
                res.add(nums[i]);
            }
        }
        return res;
    }
    void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
