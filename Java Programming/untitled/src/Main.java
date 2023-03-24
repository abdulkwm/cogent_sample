public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(summation(5));
    }
    public static int factorial(int n){
        //Base Case
        if (n <= 1){
            return 1;
        }
        //Recursion Case
        else {
            return n * factorial(n - 1);
        }
    }
    public static int summation(int n){
        //Base Case
        if (n <= 0){
            return 0;
        }
        //Recursion Case
        else {
            return n + summation(n -1);
        }
    }
}
