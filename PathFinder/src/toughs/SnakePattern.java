package toughs;
/*
 *21.Given N. print the following snake pattern (say N = 4). condition:  must not use arrays ( 1D array  or 2D array like Matrix ).

1   2   3   4

8   7   6    5

9   10  11   12

16  15  14  13
 *
* */
public class SnakePattern {
    public static void main(String[] args) {
        int n = 4;
        int value = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Print from left to right
                for (int j = 0; j < n; j++) {
                    System.out.print(value + " ");
                    value++;
                }
            } else {
                // Print from right to left
                int temp = value + n - 1;
                for (int j = 0; j < n; j++) {
                    System.out.print(temp + " ");
                    temp--;
                    value++;
                }
            }
            System.out.println();
        }
    }
}
