import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0;

        do {
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
                //int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum = sum + number;
            }catch (NumberFormatException num){
                System.out.println("Invalid number");
            }
        }
        while (counter <= 5);
        System.out.println("The sum of 5 numbers = " + sum);
    }
}
