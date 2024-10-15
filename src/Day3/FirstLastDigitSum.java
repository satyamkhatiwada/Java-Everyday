package src.Day3;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int firstNumber =0;
        int lastNumber =0;
        if (number <0){
            return -1;
        }
        lastNumber = number % 10;
        while(number > 9){
            number = number / 10;
        }
        firstNumber = number;
        int sum = lastNumber + firstNumber;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1909));
    }
}
