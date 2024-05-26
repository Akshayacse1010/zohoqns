package toughs;

/*
* ) Given a 2D grid of characters, you have to search for all the words in a dictionary by

moving only along two directions, either right or down. Print the word if it occurs.

Sample :

  a   z  o   l

  n   x  h   o

  v   y   i   v

  o   r   s  e

 Dictionary = {van, zoho, love, are, is}

 Output:

    zoho

    love

    Is */
import java.util.*;

public class WordSearch {
    public static void main(String[] args) {
        char[][] grid = {
                {'a', 'z', 'o', 'l'},
                {'n', 'x', 'h', 'o'},
                {'v', 'y', 'i', 'v'},
                {'o', 'r', 's', 'e'}
        };

        String[] dictionary = {"van", "zoho", "love", "are", "is"};

        findWords(grid, dictionary);
    }

    public static void findWords(char[][] grid, String[] dictionary) {
        int m = grid.length;
        int n = grid[0].length;

        for (String word : dictionary) {
            boolean found = false;

            // Start searching for the word from each cell in the grid
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (searchWord(grid, word, i, j)) {
                        System.out.println(word);
                        found = true;
                        break;  // Exit the inner loop if word is found
                    }
                }
                if (found) {
                    break;  // Exit the outer loop if word is found
                }
            }
        }
    }

    // Search for the word starting from position (i, j)
    public static boolean searchWord(char[][] grid, String word, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        int len = word.length();

        // Check if the word can fit starting from position (i, j) towards right
        if (j + len <= n) {
            String horizontal = "";
            for (int k = j; k < j + len; k++) {
                horizontal += grid[i][k];
            }
            if (horizontal.equals(word)) {
                return true;
            }
        }

        // Check if the word can fit starting from position (i, j) downwards
        if (i + len <= m) {
            String vertical = "";
            for (int k = i; k < i + len; k++) {
                vertical += grid[k][j];
            }
            if (vertical.equals(word)) {
                return true;
            }
        }

        return false;
    }
}

