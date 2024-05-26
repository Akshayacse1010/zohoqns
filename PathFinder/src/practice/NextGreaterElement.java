package practice;

public class NextGreaterElement {

    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int great = arr[n - 1];
        int max = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                max = arr[i];
                arr[i] = -1;
            } else {
                max = arr[i];
                arr[i] = great;
                if (max > great) {
                    great = max;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        NextGreaterElement solution = new NextGreaterElement();
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] result = solution.replaceElements(arr);

        System.out.print("Replaced elements: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
