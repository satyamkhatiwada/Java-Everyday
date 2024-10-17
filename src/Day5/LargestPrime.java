package src.Day5;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int largestPrime = 0;
        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }
        int factor = 3;
        while(factor<=number){
            while(number%factor==0){
                largestPrime = factor;
                number/=factor;
            }
            factor+=2;
        }
        if(number>2){
            largestPrime =number;
        }
        return largestPrime;

    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(100));
    }
}