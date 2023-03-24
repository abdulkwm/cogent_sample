public class Main1 {
    public static void main(String[] args) {
        System.out.println("the sum of 3 and 5 divisor in a number = " + sum3And5(57));
        System.out.println(isPrime(21));
        int count = 0;
        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is prime number");
                count++;
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sum3And5(int number) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                if (count == 5) {
                    break;
                }
            }
        }
        return sum;
    }
}
