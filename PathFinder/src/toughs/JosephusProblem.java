package toughs;

import java.util.ArrayList;
import java.util.List;
/*
* 20. There is a circular queue of processes. Every time there will be certain no of process skipped and a particular start position. Find the safe position.

Input: Number of process:5

       Start position:3

       Skip: 2nd

Output: 1 will be the safest position

(Logic: 1 2 3 4 5 starting from 3, 5th process will be skipped

        1 2 3 4 5 process 2 will be skipped

        1 2 3 4 5 process 4 will be skipped

        1 2 3 4 5 process 3 will be skipped, so safest process is 1.
* */
public class JosephusProblem {

    public static int safePosition(int n, int start, int skip) {
        List<Integer> processes = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            processes.add(i);
        }

        int index = start - 1;  // Convert to zero-based index for starting position

        while (processes.size() > 1) {
            index = (index + skip) % processes.size();  // Find the index of the process to eliminate
            processes.remove(index);  // Eliminate the process
        }

        return processes.get(0);  // Return the last remaining process
    }

    public static void main(String[] args) {
        int n = 5;
        int start = 3;
        int skip = 2;

        int safePos = safePosition(n, start, skip);
        System.out.println("The safe position is " + safePos);
    }
}
