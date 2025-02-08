public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.rotate(new int[][]{{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}});
    }
    static void print(int[][] matirx){
        for(int i= 0 ; i< matirx.length ;i++){
            for(int j = 0 ;j < matirx[0].length;j++){
                System.out.printf(matirx[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0 ;i <= matrix.length - 2; i++){
            for(int j = 0 ;j <= matrix.length - 2 - i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - j][matrix.length - 1 - i];
                matrix[matrix.length - 1 - j][matrix.length - 1 - i] = temp;
            }
        }

        for(int i = 0 ;i < (matrix.length) / 2 ; i++){
            for(int j = 0 ;j < matrix.length ;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - i][j];
                matrix[matrix.length - 1 - i][j] = temp;
            }
        }

    }

}