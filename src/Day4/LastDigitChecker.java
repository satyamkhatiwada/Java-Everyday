package src.Day4;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int third){
        // checking for validation
        if (!isValid(first) || !isValid(second) || !isValid(third)){
            return false;
        }

        int firstRight = first%10;
        int secondRight = second%10;
        int thirdRight = third%10;

        if(firstRight==secondRight || firstRight == thirdRight || secondRight == thirdRight){
            return true;
        }
        return false;
    }

    public static boolean isValid(int number){
        return (number>9 && number<1001);
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(4,5,6));
    }

}
