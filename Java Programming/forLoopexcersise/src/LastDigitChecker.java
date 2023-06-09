public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        int right1 = num1 % 10;
        int right2 = num2 % 10;
        int right3 = num3 % 10;
        if ((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) &&
                (num3 >= 10 && num3 <= 1000)){
            return right1 == right2 || right1 == right3 || right2 == right3;
        }
        return false;
    }
    public static boolean isValid(int num1){
        if (num1 >= 10 && num1 <= 1000){
            return true;
        }
        return false;    }
}
