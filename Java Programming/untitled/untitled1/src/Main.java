public class Main {
    public static void main(String[] args) {
        System.out.println(getTheName('d'));
        printWeekDay(4);
        printNumberInWord(6);
        System.out.println(getDaysInMonth(2,2020));
    }
    public static String getTheName(char Nato){
        String cha = Character.toString(Nato).toUpperCase();
        return switch (cha) {
            case "A" -> cha + " = " + "Abel";
            case "B" -> cha + " = " + "Baker";
            case "C" -> cha + " = " + "Charlie";
            case "D" -> cha + " = " + "Dog";
            case "E" -> cha + " = " + "Easy";
            default -> cha + " not found";
        };
    }
    public static void printWeekDay(int day){
        switch (day) {
            case 0 -> System.out.println("sunday");
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            default -> System.out.println("Invalid Day");
        }
    }
    public static String printNumberInWord(int num){
        return switch (num) {
            case 0 -> ("ZERO");
            case 1 -> ("ONE");
            case 2 -> ("TWO");
            case 3 -> ("THREE");
            case 4 -> ("FOUR");
            case 5 -> ("FIVE");
            case 6 -> ("SIX");
            case 7 -> ("SEVEN");
            case 8 -> ("EIGHT");
            case 9 -> ("NINE");
            default -> ("OTHER");
        };
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999){
            if (year % 4 == 0 && year % 100 != 0){
                return true;
            }
            else if (year % 100 == 0 && year % 400 == 0){
                return true;
            }
            return false;
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            default -> {
                return 0;
            }
        }
    }
}