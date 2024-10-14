public class NumberOfDaysInMonth {
    // write code here
    public static boolean isLeapYear(int year) {
        boolean isLeap = false;

        switch (year) {
            default -> {
                if (year >= 2 && year <= 9999) {
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        isLeap = true;
                    }
                }
            }
        }

        return isLeap;
    }
    public static int getDaysInMonth(int month, int year){
        if (month<1 || month>12){
            return -1;
        }
        if(year<1|| year>9999){
            return -1;
        }
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1; // Should never be reached because of earlier validation
        };
    }

}