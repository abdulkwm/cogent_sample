public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getAdditionResult(){
        double add = firstNumber + secondNumber;
        return add;
    }
    public double getSubtractionResult(){
        double sub = firstNumber - secondNumber;
        return sub;
    }
    public double getMultiplicationResult(){
        double mul = firstNumber * secondNumber;
        return mul;
    }
    public double getDivisionResult(){
        double dev = firstNumber/secondNumber;
        if (secondNumber == 0){
            return 0;
        }else {
           return dev;
        }
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
