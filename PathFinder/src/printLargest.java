import java.util.Arrays;
import java.util.Comparator;

class Solution {
    String printLargest(int n, String[] arr) {
        // Define a custom comparator
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare concatenated results
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab); // Sort in descending order
            }
        };

        // Sort the array using the custom comparator
        Arrays.sort(arr, customComparator);

        // If the largest number is "0", the result is "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build the largest number by concatenating sorted strings
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] arr1 = {"3", "30", "34", "5", "9"};
        System.out.println(sol.printLargest(5, arr1)); // Output: 9534330

        String[] arr2 = {"54", "546", "548", "60"};
        System.out.println(sol.printLargest(4, arr2)); // Output: 6054854654
    }
}

