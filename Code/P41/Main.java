public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0 ;i < nums.length ;i++){
            while (nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]){
                // 将nums[i] 存放到 index = nums[i] - 1 中
                // index = nums[i] - 1的值存放到 index = i上
                swap(nums,nums[i] - 1 , i);
            }
        }
        for(int i = 0 ;i < nums.length ;i++){
            if(nums[i] - 1 != i){
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    void swap(int [] nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}