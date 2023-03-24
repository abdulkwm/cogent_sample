public class Vehicle {
    int passengers;
    int fuelCap;
    int mpg;
    // adding constructor

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelCap = f;
        mpg = m;
    }

    int range() {
        return fuelCap * mpg;
    }

    public double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}