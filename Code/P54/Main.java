import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int i = 0 , j = 0 ;
        int right = matrix[0].length - 1, down = matrix.length - 1;
        int left = 0 , up = 1;
        int count = matrix.length * matrix[0].length,num = 0;
        while(num < count){
            while(num < count && j <= right){
                res.add(matrix[i][j++]);
                num++;
            }
            j--;
            i++;
            while(num < count && i <= down){
                res.add(matrix[i++][j]);
                num++;
            }
            i--;
            j--;
            while(num<count && j >= left){
                res.add(matrix[i][j--]);
                num++;
            }
            j++;
            i--;
            while(num < count && i >= up){
                res.add(matrix[i--][j]);
                num++;
            }
            i++;
            j++;

            right -= 1;
            down -= 1;
            left += 1;
            up += 1;

        }
        return res;
    }
}