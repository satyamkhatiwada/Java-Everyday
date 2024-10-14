package src.Day2;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastNumber =0;
        int originalNum = number;
        while(number!=0){
            lastNumber = number % 10;
            reverse = reverse * 10 + lastNumber;
            number /= 10;
        }
        return originalNum == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
}
