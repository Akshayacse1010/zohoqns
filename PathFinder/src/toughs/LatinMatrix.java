package toughs;
/*
* 22.Given N. print the Latin Matrix (say N = 3). condition:  must not use strings(aka character literals), arrays (both 1D and 2D), inbuilt functions(like rotate).

 A   B   C
B   C   A
C   A   B
* */
public class LatinMatrix {
    public static void main(String[] args) {
        int N = 3;  // You can change N to any positive integer

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Calculate the ASCII value for the character
                int charValue = 65 + (i + j) % N;
                // Convert the ASCII value to a character and print it
                System.out.print((char)charValue + " ");
            }
            System.out.println();
        }
    }
}
