package src.Day2;

public class SumOddRange {
    public static boolean isOdd(int number) {
        return (number > 0 && number % 2 != 0); // Check if number is positive and odd
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        // Validate range
        if (start > end || start <= 0 || end <= 0) {
            System.out.println("Invalid input range");
            return -1; // Return -1 for invalid input ranges
        }

        // Loop from start to end and sum odd numbers
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                System.out.println("Odd number found: " + i);
                sum += i;
            }
        }
        System.out.println("Final sum: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of odd numbers: " + sumOdd(1, 5)); // Expected output: 9 (1 + 3 + 5)
    }
}
