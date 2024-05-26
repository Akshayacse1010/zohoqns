package toughs;
/*
* •	Given a matrix NxN, you are initially in the 0, 0 position. The matrix is filled with ones and zeros. Value “one” represents the path is available, while “zero” represents the wall. You need to find the can you able to reach the (N-1)x(N-1) index in the matrix. You can move only along the right and down directions if there’s “one” available.

•	Input:
•	5 //N value

•	1 0 1 0 0
•	1 1 1 1 1
•	0 0 0 1 0
•	1 0 1 1 1
•	0 1 1 0 1

•	Output:
Yes
* */
import java.util.Scanner;

public class CheckIfThereIsAPath{
    static boolean foundPath = false;

    public static void main(String[] args) {
        int N = 5; // Example N value

        int[][] matrix = {
                {1, 0, 1, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 1, 0, 1}
        };

        dfs(matrix, 0, 0);
        String result = foundPath ? "Yes" : "No";
        System.out.println(result);
    }

    public static void dfs(int[][] matrix, int row, int col) {
       if(row == matrix.length || col == matrix.length || col < 0 || row < 0 || matrix[row][col] == 0){
           return;
       }
       if(row == matrix.length - 1 && col == matrix.length - 1){
           foundPath = true;
           return;
       }
       dfs(matrix, row + 1, col);
       dfs(matrix, row, col + 1);
    }
}
