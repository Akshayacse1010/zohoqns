//1) Given an array, find the minimum of all the greater numbers for each element in the array.
//
//Sample:
//
//Array : {2, 3, 7, ­1, 8, 5, 11}
//
//Output:
// use tree set , most efficient
//
//{2­>3, 3­>5, 7­>8, ­1­>2, 8­>11, 5­>7, 11­>}
import java.util.*;
import java.util.*;

public class MinGreaterNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> result = findMinGreaterNumbers(arr);

        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + (entry.getValue() == null ? "" : entry.getValue()));
        }

        scanner.close();
    }
//     2, 3, 7, -1, 8, 5, 11
//        5
//       / \
//      2   8
//     / \  / \
//   -1  3 7  11
    public static Map<Integer, Integer> findMinGreaterNumbers(int[] arr) {
        Map<Integer, Integer> result = new HashMap<>();
        TreeSet<Integer> sortedSet = new TreeSet<>();

        // Add all elements to TreeSet to maintain a sorted order
        for (int num : arr) {
            sortedSet.add(num);
        }

        // Find the minimum greater element for each element
        for (int num : arr) {
            Integer minGreater = sortedSet.higher(num);
            result.put(num, minGreater);
        }

        return result;
    }
}
