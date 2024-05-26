// Java Program to shuffle a given array
import java.util.Random;
import java.util.*;
public class FisherYates
{
    // A Function to generate a random permutation of arr[]
    static void swap(int i, int j, int[] arr){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
   static void randomize( int arr[], int n)
    {
        // Creating a object for Random class
        Random r = new Random();
        for(int i = 0; i < n; i++){
            int j = r.nextInt(n);
            swap(i , j , arr);
        }
        System.out.println(Arrays.toString(arr));
    }

    // Driver Program to test above function
    public static void main(String[] args)
    {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        randomize (arr, n);
    }
}
// This code is contributed by Sumit Ghosh
