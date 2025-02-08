import java.util.ArrayList;
import java.util.List;

public class Main {

}
class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer[]> pairList = new ArrayList<>();
        for(int i = 0 ; i < matrix.length;i++){
            for(int j = 0 ; j < matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    pairList.add(new Integer[]{i,j});
                }
            }
        }
        for(Integer[] tem: pairList){
            change(matrix,tem[0],tem[1]);
        }
    }
    void change(int[][] matrix,int raw,int col){
        for(int i = 0 ;i < matrix[0].length ; i++){
            matrix[raw][i] = 0;
        }
        for(int i = 0 ;i < matrix.length; i++){
            matrix[i][col] = 0;
        }
    }
}
