import java.util.Scanner;

public class newArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("please enter the size of an Array");
        int size = sc.nextInt();
        int score [] = new int[size];
        for (int i = 0; i < score.length; i++){
            System.out.println("please enter the " + i +" score");
            int s = sc.nextInt();
            score[i] = s;
        }
        for (int i = 0; i < score.length; i++){
            sum = sum + score[i];
        }
        System.out.println("the sum of an array is : " + sum);
//        this is fore each loop
        for (int i : score) {
            System.out.println(sum);
        }
    }
}
