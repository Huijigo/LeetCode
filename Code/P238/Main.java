public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] res = solution.productExceptSelf(new int[]{1,2,3,4});
        for(int r : res){
            System.out.printf(r + " ");
        }
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] fronmerge = new int[nums.length];
        int[] endmerge = new int[nums.length];
        fronmerge[0] = 1;
        endmerge[nums.length - 1] = 1;
        for(int i = 1 ;i < nums.length ; i++){
            fronmerge[i] = nums[i-1] * fronmerge[i - 1];
            endmerge[nums.length - 1 - i] = nums[nums.length - i] * endmerge[nums.length - i];
        }
        int[] res = new int[nums.length];
        res[0] = endmerge[0];
        res[nums.length - 1] = fronmerge[nums.length - 1];
        for(int i =1 ;i < nums.length - 1 ; i++){
            res[i] = fronmerge[i] * endmerge[i];
        }
        return res;
    }
}