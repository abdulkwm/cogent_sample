public class Main {
    public static void main(String[] args) {
//        printDayOfTheWeek(-1);
//        DayOfTheWeekChallenge.printDayOfTheWeek(1);
//        NumberInWord.printNumberInWord(7);
//        boolean numOfDays = NumberOfDaysInMonth.isLeapYear(2000);
//         System.out.println(numOfDays);

//        for (int i = 2; i < 9; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",Loop.calculateInterest(10000,i)));
//        }
//        for (int i = 8; i > 1; i--){
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",Loop.calculateInterest(10000,i)));
//        }

        int count = 0;
        for (int i = 10; i < 50; i++){
            if(Loop.isPrime(i)){
                count++;
                System.out.println("Number " + i + " is prime number");
                if (count == 3){
                    System.out.println("exiting the loop");
                    break;
                }
            }
        }

    }
}

//        int value = 1;
//        if (value == 1){
//            System.out.println("value was 1");
//        } else if (value == 2) {
//            System.out.println("value was 2");
//        }else {
//            System.out.println("was not 1 or 2");
//        }
//        int switchValue = 1;
//        switch (switchValue){
//            case 1:
//                System.out.println("value was 1");
//                break;
//            case 2:
//                System.out.println("value was 2");
//                break;
//            default:
//                System.out.println("was not 1 or 2");
//                break;
//        }
//        char charValue = 'C';
//        switch (charValue){
//            case 'A':
//                System.out.println("value was A");
//                break;
//            case 'B':
//                System.out.println("value was B");
//                break;
//            case 'C': case 'D':
//                System.out.println("vale was " + charValue);
//                break;
//            default:
//                System.out.println("value could not find A, B, C or D");
//                break;
//        }
//    }
//    public static void printDayOfTheWeek(int day){
//        if (day == 0){
//            System.out.println("sunday");
//        }
//
//        switch (day){
//            case 0:
//                System.out.println("sunday");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wedsday");
//                break;
//            case 4:
//                System.out.println("Thrusday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            default:
//                System.out.println("Invalid day");
//                break;
//        }
//    }
//}
