import static java.lang.Math.PI;

public class AreaCalculator {
    public static double area(double radius){
        if (radius < 0){
            return -1.0;
        }
        return PI * radius * radius;
    }
    public static double area(double length , double width){
        if (length < 0 || width < 0){
            return  -1.0;
        }
        return length * width;
    }
}
