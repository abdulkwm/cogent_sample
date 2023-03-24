public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double decimalOne, double decimalTwo) {
        decimalOne = (int)(decimalOne * 1000);
        decimalTwo = (int)(decimalTwo * 1000);
        if (decimalOne == decimalTwo) {
            return true;
        }
        else {
            return false;
        }
    }
}