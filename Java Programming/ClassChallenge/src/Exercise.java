public class Exercise {
    public static void main(String[] args) {
        Exercise.printSum(5,10);

        Exercise exercise = new Exercise();
        exercise.bark();
    }
    public  static void printSum(int a, int b){
        System.out.println("sum = " + a + b);
    }

    public void bark(){
        System.out.println("woof");
    }
}
