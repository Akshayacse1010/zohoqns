public class RectangleSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4, 6},
                {5, 3, 8, 1, 2},
                {4, 6, 7, 5, 5},
                {2, 4, 8, 9, 4}
        };

        int startX = 2; // starting row index
        int startY = 0; // starting column index
        int endX = 3;   // ending row index
        int endY = 4;   // ending column index

        System.out.println("Rectangle:");
int sum = 0;
       for(int i = 2; i <= endX; i++){
           for(int j = 0; j <= endY; j++){
               sum += mat[i][j];
               System.out.print(mat[i][j] + " ");
           }
           System.out.println();
       }
        System.out.println(sum);
    }
}
