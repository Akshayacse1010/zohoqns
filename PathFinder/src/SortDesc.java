import java.util.*;

public class SortDesc {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 12, 2, 3, 3, 3, 12};
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                // If the element already exists in the map, increment its count
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                // If the element doesn't exist in the map, add it with a count of 1
                mp.put(arr[i], 1);
            }
        }

        // Now mp contains the frequency of each element
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}
