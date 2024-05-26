
//2) Find the largest sum contiguous subarray which should not have negative numbers. We have to print the sum and the corresponding array elements which brought up the sum.
//
//Sample:
//
//Array : {­2, 7, 5, ­1, 3, 2, 9, ­7}
//
//Output:
//
//     Sum : 14
//
//     Elements : 3, 2, 9
public class Kadane {

    public static void main(String[] args) {
        int currmax = 0;
        int mainmax =  Integer.MIN_VALUE;
// add + update + checkneg
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        for(int x   :arr){
            currmax+=x;
        if(currmax  >= mainmax){
            mainmax = currmax;
        }
        if(currmax <= 0){
            currmax = 0;
        }
        }
        System.out.println(mainmax);
    }
}
