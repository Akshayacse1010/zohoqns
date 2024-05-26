package toughs;

import java.util.ArrayList;

/*
* 8. Q2. Print all possible subsets of the given array whose sum equal to given N.

example: Input: {1, 2, 3, 4, 5} N=6 Output: {1, 2, 3}, {1, 5}, {2, 4}*/
public class SubsetSum {

    public static void main(String[] args) {
        // This is the main method where you can call your subset sum solution method.

        // Example input
        int[] nums =  {1, 2, 3, 4, 5};
        int target = 6;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // Call the subset sum method (to be implemented) and print the result
        ArrayList<Integer> temp = new ArrayList<>();
         isSubsetSum( 0 , 0 ,temp , nums, target , ans);
        System.out.println(ans);
    }

    // Method to be implemented
    public static void isSubsetSum(int ind ,int sum , ArrayList<Integer> temp , int[] nums, int target ,     ArrayList<ArrayList<Integer>> ans) {
        // Your solution code will go here
        if(sum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(ind == nums.length){
            return;
        }
        if(sum + nums[ind] >  target){
            return;
        }
        temp.add(nums[ind]);
        isSubsetSum(ind + 1, sum + nums[ind], temp, nums, target, ans);
        temp.remove(temp.size()-1);
        isSubsetSum(ind + 1, sum, temp, nums, target, ans);
    }
}
