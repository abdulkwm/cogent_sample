public class FirstLastDigitSum {
    public static int sumFirstLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        while (number > 9){
            number = number / 10;
        }
        return lastDigit + number;
    }
}
