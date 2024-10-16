package src.Day4;

public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second) {
        if (first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }

        // Extract digits from both numbers
        int firstDigitFirst = first % 10;
        int secondDigitFirst = first / 10;

        int firstDigitSecond = second % 10;
        int secondDigitSecond = second / 10;

        // Compare all possible combinations of digits between the two numbers
        if (firstDigitFirst == firstDigitSecond || firstDigitFirst == secondDigitSecond ||
                secondDigitFirst == firstDigitSecond || secondDigitFirst == secondDigitSecond) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        // test expected ture
        System.out.println(SharedDigit.hasSharedDigit(12, 23));
        System.out.println(SharedDigit.hasSharedDigit(15, 55));

        //expected false
        System.out.println(SharedDigit.hasSharedDigit(11, 55));
    }

}
