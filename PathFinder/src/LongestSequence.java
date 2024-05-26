public class LongestSequence {
    public static void main(String[] args) {
        String input1 = "abcccccbba";
        String input2 = "aaaaaaaa";

        System.out.println("Longest sequence in input1: " + findLongestSequence(input1));
        System.out.println("Longest sequence in input2: " + findLongestSequence(input2));
    }

    public static int findLongestSequence(String s) {
        int maxLength = 0;
        int[] firstOccurrence = new int[256]; // Assuming ASCII characters
        int[] lastOccurrence = new int[256];

        // Initialize firstOccurrence array with -1 indicating no occurrence yet
        for (int i = 0; i < 256; i++) {
            firstOccurrence[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (firstOccurrence[c] == -1) {
                firstOccurrence[c] = i; // Record the first occurrence
            }
            lastOccurrence[c] = i; // Update the last occurrence
        }

        for (int i = 0; i < 256; i++) {
            if (firstOccurrence[i] != -1) {
                int length = lastOccurrence[i] - firstOccurrence[i] + 1;
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        return maxLength;
    }
}
