package toughs;
//

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {

    void perm(int i, StringBuilder sb, List<String> ans, String s, int[] vis) {
        if (i >= s.length()) {
            ans.add(sb.toString()); // Add the current permutation to the list
            return;

        }
        for (int ind = 0; ind < s.length(); ind++) {
            if (vis[ind] == 0) {
                sb.append(s.charAt(ind));
                vis[ind] = 1;
                perm(i + 1, sb, ans, s, vis);
                vis[ind] = 0;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public List<String> generatePermutations(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int[] vis = new int[s.length()];
        perm(0, sb, ans, s, vis);
        return ans;
    }

    public static void main(String[] args) {
        PermutationsOfString solution = new PermutationsOfString();
        String s = "abc"; // Example input string
        List<String> permutations = solution.generatePermutations(s);
        System.out.println("Permutations of " + s + ": " + permutations);
    }
}
