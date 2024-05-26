package toughs;
/*
* . 18. -1 represents ocean and 1 represents land find the number of islands in the given matrix.

Input:   n*n matrix

       1 -1 -1  1
      -1  1 -1  1
      -1 -1  1 -1
      -1 -1 -1  1
Output: 2 (two islands that I have

bold in matrix at 1, 1 and 2, 2)
* */
public class NoOfIslands {
   static void dfs(int r , int c , int[][] matrix){
        if(r == matrix.length || c == matrix.length || r < 0 || c < 0 || matrix[r][c] == 1){
            return;
        }
        matrix[r][c] = 1;
        int[] dr = {-1 , 1 , 0 , 0};
        int[] dc = {0 , 0 , -1 , 1};
        for(int i =0; i < 4 ; i++){
            dfs(r + dr[i], c + dc[i], matrix);
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, -1, -1, 1},
                {-1, 1, -1, 1},
                {-1, -1, 1, -1},
                {-1, -1, -1, 1}
        };
int c = 0;
        // Print the 2D matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               if(matrix[i][j] == -1){
                   dfs(i , j , matrix);
                   c++;
               }
            }

        }
        System.out.println("count : "  +c);
    }
}
