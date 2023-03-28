import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        int num = sc.nextInt();
        System.out.println("the prime number between 0 and " + num+ " is: ");
        int i,j,flag;
        for (i = 2; i <= num ; i++) {
            flag = 0;
            for (j = 2; j <= i /2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
            }
        }
        System.gc();
    }
}
