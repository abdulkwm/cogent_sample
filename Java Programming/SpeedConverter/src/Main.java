public class Main {
    public static void main(String[] args) {
        //speed converter
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println(miles);

        SpeedConverter.printConversion(10.5);

        //megabytes converter
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        //barking dog
        boolean barkingDog = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(barkingDog);

        // Leap Year

        boolean leapYear = LeapYear.isLeapYear(2017);
        System.out.println(leapYear);

        //Decimal comparator
        boolean decimalComp = DecimalComparator.areEqualByThreeDecimalPlaces(2.43, 22.567);
        System.out.println(decimalComp);

        //Equal sum checker
        boolean equalSum = EqualSumChecker.hasEqualSum(1, 2, 4);
        System.out.println(equalSum);

        // teen number checker
        boolean teenNumber = TeenNumberChecker.hasTeen(2, 45, 5);
        System.out.println(teenNumber);
        boolean isteens = TeenNumberChecker.isTeen(13);
        System.out.println(isteens);

        // area calculator
        double areaOfCircle = AreaCalculator.area(5.0);
        System.out.println("area of circle = " + areaOfCircle);

        double areaOfRectangle = AreaCalculator.area(-1,4);
        System.out.println("area of rectangle = " + areaOfRectangle);

        // Minutes to years and days converter
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);

        // Equality printer

        IntEqualityPrinter.printEqual(1,2,1);

        // playing cat
        boolean playinCat = PlayingCat.isCatPlaying(false,35);
        System.out.println("playing cat = " + playinCat);

        //----------------------*******----------------------
        int newScore = calculateScore("Tim",500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " score " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("unnamed player score " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("no player name, no player score");
        return 0;
    }
    //----------------------------##--------------------
    public static long calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet < 0 || (inches < 0 && inches > 12)){
            return -1;
        }
        long feetToCm = (long) (30.48 * feet);
        long inchesToCm = (long)(2.54 * inches);
        return feetToCm;
    }
}