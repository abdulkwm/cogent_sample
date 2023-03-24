public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("toyota");
        car.setModel("camry");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}
