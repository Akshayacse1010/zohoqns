package toughs;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    void perm(int i ,List<Integer>ds,  List<List<Integer>> ans , int[] nums, int[] vis  ){
if(i == nums.length) {
    ans.add(new ArrayList<>(ds));
    return;
} for(int ind = 0; ind < nums.length; ind++){
      if(vis[ind] == 0){
          ds.add(nums[ind]);
          vis[ind] = 1;
          perm(i + 1 , ds , ans , nums , vis);
          vis[ind] = 0;
          ds.remove(ds.size()-1);
      }

    }
}


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>ds = new ArrayList<>();
        int[] vis = new int[nums.length];
        perm(0 , ds , ans , nums , vis);
        return ans;
    }

    public static void main(String[] args) {
        Permutations solution = new Permutations();
        int[] nums = {1, 2, 3}; // Example input array
        List<List<Integer>> permutations = solution.permute(nums);
        System.out.println("Permutations:");
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }
}
