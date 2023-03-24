public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++ ){
            if ((i % 3 == 0) && (i % 5 == 0)){
                count++;
                sum+= i;
                System.out.println("found number = " + i);
            }
            if (count == 5){
                break;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println(SumOddRange.isOdd(7));
        System.out.println(SumOddRange.sumOdd(5,9));


        System.out.println("sum of digit in number 125 is " + SumOddRange.sumDigits(125));
        System.out.println("sum of digit in number 125 is " + SumOddRange.sumDigits(-125));
        System.out.println("sum of digit in number 125 is " + SumOddRange.sumDigits(4));
        System.out.println("sum of digit in number 125 is " + SumOddRange.sumDigits(32123));

        //palindrome number

        System.out.println("the number 707 is palindrome " + NumberPalindrome.isPalindrome(707));


        System.out.println("the sum of the digit in number 125 is " + sumDigits(125));
        System.out.println("the sum of the digit in number 125 is " + sumDigits(100));

        //Sum omf first And Last Number

        System.out.println(FirstLastDigitSum.sumFirstLastDigit(3457645));

        //even digit sum
        System.out.println("sum of even num");
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));

        //shared  digits

        System.out.println("shared digits =" + SharedDigit.hasSharedDigit(22,12));

        // last digit checker
        System.out.println("last digit checker =" + LastDigitChecker.hasSameLastDigit(9,99,999));
        System.out.println("isValid = " + LastDigitChecker.isValid(1051));

        // greatest common divisor

        System.out.println("the greatest common divisor = " + GreatestCommonDivisor.getGreatestCommonDivisor(81,153));

        // All Factors of Number
       FactorPrinter.printFactors(6);

       // Perfect Number
        System.out.println("The perfect number = " + PerfectNumber.isPerfectNumber(6));
        // Number to words;
        NumberToWords.numberToWords(123);

        // flourPacker
        System.out.println("flour packer = " + FlourPacker.canPack(2,2,5));

        // LargestPrimeFactorNum
        System.out.println("largest prime number is = " + LargestPrime.getLargestPrime(20));


        // Diagonal star
        System.out.println("diagonal pattern ");
        DiagonalStar.printSquareStar(6);
    }

    public static int sumDigits(int number) {
        if (number < 10){
            return -1;
        }
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
}