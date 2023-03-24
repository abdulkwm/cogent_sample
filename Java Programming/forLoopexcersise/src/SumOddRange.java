public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number > 0 && number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int sumOddNum = 0;
        if (start > 0 && end > 0 && end >= start){
            for (int i = start; i <= end; i++){
                if (isOdd(i)==true){
                    sumOddNum = sumOddNum + i;
                }
            }
            return sumOddNum;
        }
        else {
            return -1;
        }
    }
    public static int sumDigits(int number){
        if (number < 10){
            return  -1;
        }
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5;
        while (number > 0){
            // extract list significant digit
            int digit = number % 10;
            sum += digit;
            // drop list significant digit
            number /= 10;
        }
        return sum;
    }
}


//public class SumOddRange {
//    public static boolean isOdd(int number){
//        if (number > 0 && number % 2 != 0){
//            return true;
//        }
//        return false;
//    }
//    public static int sumOdd(int start, int end){
//        int sumOfOddNum = 0;
//        if ((start > 0 && end > 0) && end >= start){
//            for (int i = start; i <= end; i++){
//                if (isOdd(i)){
//                    sumOfOddNum = sumOfOddNum + i;
//                }
//            }
//            return sumOfOddNum;
//        }
//        else {
//            return -1;
//        }
//    }
//}
