public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;

        // Addition
        System.out.println("Addition: " + (a + b));

        // Subtraction
        System.out.println("Subtraction: " + (a + (-b)));

        // Multiplication
        int mul = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            mul += a;
        }
        System.out.println("Multiplication: " + mul);

        // Division
        int div = 0;
        int sign = (a < 0 ^ b < 0) ? -1 : 1; // Check for different signs
        a = Math.abs(a);
        b = Math.abs(b);
        while (a >= b) {
            a -= b;
            div++;
        }
        System.out.println("Division: " + div * sign);
    }
}
