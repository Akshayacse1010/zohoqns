package toughs;

public class zohoStarproblem {
    public static void main(String[] args) {
        System.out.println(isSubstring("Spoon", "Sp*n")); // Output: TRUE
        System.out.println(isSubstring("Zoho", "*o*o")); // Output: TRUE
        System.out.println(isSubstring("Man", "n*"));    // Output: FALSE
        System.out.println(isSubstring("Subline", "line")); // Output: TRUE
    }

    public static boolean isSubstring(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // If the second string is longer than the first, it can't be a substring
        if (len2 > len1)
            return false;

        // If both strings are empty, return true
        if (len1 == 0 && len2 == 0)
            return true;

        int i = 0, j = 0;

        while (i < len1 && j < len2) {
            // If characters match, move to the next character in both strings
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else if (str2.charAt(j) == '*') {
                // If '*' encountered, move in the second string until it doesn't match or until the end
                while (j < len2 && str2.charAt(j) == '*') {
                    j++;
                }
                // If '*' is at the end, it matches any remaining characters in the first string
                if (j == len2)
                    return true;
                // Otherwise, move in the first string until a character matches the next character after '*'
                while (i < len1 && str1.charAt(i) != str2.charAt(j)) {
                    i++;
                }
            } else {
                // If characters don't match and '*' is not encountered, reset j and continue from the next character in the first string
                j = 0;
                i++;
            }
        }

        // If we reached the end of the second string, it means it's a substring
        return j == len2;
    }
}
