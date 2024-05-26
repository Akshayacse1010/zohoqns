package toughs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*Help john to find new friends in social network

Input:

3

Mani 3 ram raj guna

Ram 2 kumar Kishore

Mughil 3 praveen Naveen Ramesh

Output:

Raj guna kumar Kishore praveen Naveen Ramesh

*/
import java.util.HashSet;
import java.util.*;

public class FindNewFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of people
        int numPeople = Integer.parseInt(scanner.nextLine());

        HashSet<String> johnFriends = new HashSet<>();
        HashSet<String> allFriends = new HashSet<>();

        // Read input data and find John's friends
        for (int i = 0; i < numPeople; i++) {
            String[] parts = scanner.nextLine().split(" ");
            if (parts[0].equals("John")) {
                johnFriends.addAll(Arrays.asList(parts).subList(2, parts.length));
            }
            allFriends.addAll(Arrays.asList(parts).subList(2, parts.length));
        }

        // Find friends who are not already connected to John
        allFriends.removeAll(johnFriends);

        // Output the new friends found
        for (String friend : allFriends) {
            System.out.print(friend + " ");
        }
    }
}
