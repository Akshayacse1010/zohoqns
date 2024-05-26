import java.util.ArrayList;

public class printxo {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0;
        int bot = r - 1; // Fix: Use r as the number of rows
        int left = 0;
        int right = c - 1; // Fix: Use c as the number of columns
        while(top <= bot && left <= right){
            for(int i = left; i <= right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bot; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top <= bot){
                for(int i = right; i>= left; i--){
                    ans.add(matrix[bot][i]);
                }
                bot--;
            }
            if(left <= right){
                for(int i = bot; i >= top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 0, 0},
                {5, 19, 19}
        };
        int rows = 2;
        int cols = 3;

        ArrayList<Integer> result = spirallyTraverse(matrix, rows, cols);
        System.out.println("Spiral traversal result: " + result);
    }
}
