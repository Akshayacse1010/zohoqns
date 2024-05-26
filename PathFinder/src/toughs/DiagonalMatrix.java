package toughs;

class DiagonalMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
        int i = 0;
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int col = 0;
        int[] arr = new int[m * n];
        boolean t = true;

        while (row < m && col < n) {
            if (t) {
                while (row > 0 && col < n - 1) {
                    arr[i++] = mat[row][col];
                    row--;
                    col++;
                }
                arr[i++] = mat[row][col];
                if (col == n - 1) {
                    row++;
                } else {
                    col++;
                }
            } else {
                while (row < m - 1 && col > 0) {
                    arr[i++] = mat[row][col];
                    row++;
                    col--;
                }
                arr[i++] = mat[row][col];
                if (row == m - 1) {
                    col++;
                } else {
                    row++;
                }
            }
            t = !t;
        }

        return arr;
    }

    public static void main(String[] args) {
        DiagonalMatrix dm = new DiagonalMatrix();
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] result = dm.findDiagonalOrder(mat);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
