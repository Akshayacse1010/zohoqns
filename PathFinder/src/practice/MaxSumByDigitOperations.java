package practice;
/*
* 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//
•	Input:
•	5
•	120 24 71 10 59
•	Output:
•	3 8 8 1 45
Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0. Thus, maximum of this two is 3.
* */
import java.util.Scanner;

public class MaxSumByDigitOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input: The array of integers
        int[] arr = new int[n];
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Process each integer to compute the maximum value of sum or product of digits
        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            results[i] = computeMaxValue(arr[i]);
        }

        // Output the results
        System.out.println("Output:");
        for (int result : results) {
            System.out.print(result + " ");
        }
    }

    // Method to compute the maximum value by summing or multiplying the digits of an integer
    public static int computeMaxValue(int num) {
        // Your implementation here
        int sum = sumOfDigits(num);
        int pro = productOfDigits(num);
        return (sum > pro) ? sum : pro;

    }

    // Helper method to sum the digits of an integer
    public static int sumOfDigits(int num) {

        int ans = 0;
        while(num != 0){
            ans += (num % 10);
            num /= 10;
        }
        return ans; // Placeholder return value
    }

    // Helper method to multiply the digits of an integer
    public static int productOfDigits(int num) {
        // Your implementation here
        int ans = 1;
        while (num != 0){
            ans  = ans * (num %  10);
            num /= 10;
        }
        return ans; // Placeholder return value
    }
}
