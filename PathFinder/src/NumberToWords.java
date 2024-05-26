import java.util.*;
public class NumberToWords {
    // Arrays for word representation of numbers
    private static final String[] units = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
            "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        int number = 234;
        System.out.println(numberToWords(number));
    }

    public static String numberToWords(int num) {
        if (num == 0) {
            return units[0];
        }

        StringBuilder words = new StringBuilder();

        if (num / 100 > 0) {
            words.append(units[num / 100]).append(" Hundred");
            num %= 100;
            if (num > 0) {
                words.append(" and ");
            }
        }

        if (num >= 20) {
            words.append(tens[num / 10]);
            num %= 10;
            if (num > 0) {
                words.append(" ").append(units[num]);
            }
        } else if (num >= 11 && num <= 19) {
            words.append(teens[num - 10]);
        } else if (num == 10) {
            words.append(tens[1]);
        } else if (num > 0) {
            words.append(units[num]);
        }

        return words.toString();
    }
}
