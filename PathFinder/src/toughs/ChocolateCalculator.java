package toughs;
/*10. calculate Maximum number of chocolates can eat and Number of wrappers left in hand.

Money: Total money one has to spend.

Price: price per chocolate.

wrappers: minimum number of wrappers for exchange choco: number of chocolate for wrappers.

Max visit: Maximum number of times one can visit the shop.(if zero consider it infinite)

example: input: Money:40 Price:1 wrappers:3 choco:1 Max visit:1 Output: total chocolate can eat: 53 wrappers left in hand:14

*/
import java.util.Scanner;

public class ChocolateCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int money  = 40;
        int wrappers = 3;
        int price = 1;
        int chocolates = money / price;
        chocolates += (chocolates - 1) / (wrappers - 1);
        System.out.println(chocolates);

    }

    // Method to calculate total chocolates

}
