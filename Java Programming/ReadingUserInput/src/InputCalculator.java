import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        InputCalculator.inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average = 0;
        int count = 0;
        while (true) {
            System.out.println("Enter the number or, any character to exit:");
            boolean number = scanner.hasNextInt();

            if (number) {
                int data = scanner.nextInt();
                sum = sum + data;
                count++;
            } else if (count == 0) {
                System.out.println("SUM = 0 AVG = 0");
                break;
            } else {
                average = (double) sum/count;
               average = Math.round(average);
                System.out.println("SUM = " + sum + " AVG = " + (int)average);
                break;
            }
        }
            scanner.nextLine();
    }
}
