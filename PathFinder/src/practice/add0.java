package practice;

import java.util.ArrayList;

/*
* 4.Given an array as input, The condition is if the number is repeated you must add the number and put the next index value to 0. If the number is 0 print it at the last.

Eg: arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8}

Output: 4 2 12 8 0 0 0 0 0 .
* */
public class add0 {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = {0, 2, 2, 2, 0, 6, 6, 0, 8};
        int countZeroes = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZeroes++;
            } else if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                ans.add(arr[i] + arr[i + 1]);
                arr[i + 1] = 0; // set the next element to 0
            } else {
                ans.add(arr[i]);
            }
        }

        // Append the counted zeroes to the end of the list
        for (int i = 0; i < countZeroes; i++) {
            ans.add(0);
        }

        System.out.println(ans);
    }
}
