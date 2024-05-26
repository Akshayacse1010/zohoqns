import java.util.Scanner;
import java.util.Scanner;

public class NumberSubstringCheckKMP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the numbers a and b
        System.out.println("Enter number a:");
        String a = scanner.next();
        System.out.println("Enter number b:");
        String b = scanner.next();

        // Check if a is present in b using KMP algorithm
        boolean result = kmpSearch(a, b);

        // Print the result
        if (result) {
            System.out.println("Number " + a + " is present in number " + b);
        } else {
            System.out.println("Number " + a + " is not present in number " + b);
        }

        scanner.close();
    }

    public static boolean kmpSearch(String pattern, String text) {
        int m = pattern.length();
        int n = text.length();

        // Create lps[] that will hold the longest prefix suffix values for pattern
        int[] lps = new int[m];
        int j = 0; // index for pattern[]

        // Preprocess the pattern (calculate lps[] array)
        computeLPSArray(pattern, m, lps);

        int i = 0; // index for text[]
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                j++;
                i++;
            }

            if (j == m) {
                return true; // Found pattern at index (i - j)
                // j = lps[j - 1]; // For finding multiple matches, uncomment this
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                // mismatch after j matches
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }

        return false; // Pattern not found in text
    }

    public static void computeLPSArray(String pattern, int m, int[] lps) {
        // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        // the loop calculates lps[i] for i = 1 to m-1
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else { // (pattern[i] != pattern[len])
                if (len != 0) {
                    len = lps[len - 1];
                } else { // if (len == 0)
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}
