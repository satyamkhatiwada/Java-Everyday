package src.Day6;

public class EvenDigitSum {
    public static int getEvenDigitSum(int n) {
        int sum = 0;
        int lastDigit = 1;
        // if negative
        if (n<0){
            return -1;
        }
        while (n>0){
            lastDigit = n%10;
            if (lastDigit % 2 == 0){
                sum += lastDigit;
            }
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(5));
        System.out.println(getEvenDigitSum(672));
    }
}
