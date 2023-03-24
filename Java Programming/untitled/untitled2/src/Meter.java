import java.io.IOException;
public class Meter {
    public static void main(String[] args) throws IOException {
        int i, j;
        boolean isPrime;
        for (i = 2; i < 50; i++ ){
            isPrime = true;
            for (j = 2; j <= i/j; j++)
                if (i % j == 0)
                    isPrime = false;
            if (isPrime)
                System.out.println(i + " is prime!");
        }
        System.out.println("press the key followed by enter: ");
        char ch = (char) System.in.read();
        System.out.println("your key is: " + ch);
    }
}
