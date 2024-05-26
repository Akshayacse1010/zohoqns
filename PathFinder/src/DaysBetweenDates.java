public class DaysBetweenDates {
    public static void main(String[] args) {
        String s = "10 2 2014";
        String[] ar = s.split(",");
        for (String p:
             ar) {
            System.out.println(p);
        }
        int[] dt1 = {10, 2, 2014};
        int[] dt2 = {10, 3, 2015};

        System.out.println("Output: " + daysBetweenDates(dt1, dt2)); // Output: 393

        int[] dt3 = {10, 2, 2000};
        int[] dt4 = {10, 3, 2000};

        System.out.println("Output: " + daysBetweenDates(dt3, dt4)); // Output: 29

        int[] dt5 = {10, 2, 2000};
        int[] dt6 = {10, 2, 2000};

        System.out.println("Output: " + daysBetweenDates(dt5, dt6)); // Output: 0

        int[] dt7 = {1, 2, 2000};
        int[] dt8 = {1, 2, 2004};

        System.out.println("Output: " + daysBetweenDates(dt7, dt8)); // Output: 1461
    }

    public static int daysBetweenDates(int[] dt1, int[] dt2) {
        return Math.abs(totalDays(dt1) - totalDays(dt2));
    }

    public static int totalDays(int[] dt) {
         
        return 0;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int numberOfLeapYears(int year) {

        return year;
    }
}
