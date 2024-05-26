import java.util.Arrays;
import java.util.Comparator;

public class Factors {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 12, 16};
        int[] factorCounts = new int[arr.length];

        // Step 1: Calculate the factor counts for each number
        for (int i = 0; i < arr.length; i++) {
            factorCounts[i] = countFactors(arr[i]);
        }

        // Step 2: Create an array of indices
        Integer[] indices = new Integer[arr.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // Step 3: Sort the indices based on the factor counts in descending order
        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return Integer.compare(factorCounts[i2], factorCounts[i1]);
            }
        });

        // Step 4: Create a sorted array based on the sorted indices
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < indices.length; i++) {
            sortedArr[i] = arr[indices[i]];
        }

        // Output the sorted array
        System.out.println("Sorted array based on the number of factors: " + Arrays.toString(sortedArr));
    }

    private static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (i != num / i) {
                    count++;
                }
            }
        }
        return count;
    }
}
