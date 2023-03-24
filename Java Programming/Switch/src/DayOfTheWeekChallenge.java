public class DayOfTheWeekChallenge {
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedsday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
