public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int digit = 0;
        int originalNumber = number;
        while (number != 0){
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if (reverse == originalNumber){
            return true;
        }
        else {
            return false;
        }
    }
}