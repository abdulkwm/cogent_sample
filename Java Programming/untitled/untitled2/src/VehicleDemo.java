import java.util.Scanner;

public class VehicleDemo {
    public static void main(String[] args) {
        double gallon;
        int distance = 252;
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportCar = new Vehicle(21, 14, 12);
//        minivan.passengers = 7;
//        minivan.fuelCap = 16;
//        minivan.mpg = 21;

//        sportCar.passengers = 2;
//        sportCar.fuelCap = 14;
//        sportCar.mpg = 12;

        gallon = minivan.fuelNeeded(distance);
        System.out.println("to do " + distance + " miles minivan needs " + gallon + " gallons of fuel");
        gallon = sportCar.fuelNeeded(distance);
        System.out.println("to do " + distance + " miles sportsCar needs " + gallon + " gallons of fuel");


        int[] sample = {99, -10, 18, -978, 5623, 463, -9, 287, 49, 100123};
        int min, max;
        max = min = sample[0];
        for (int i = 1; i < sample.length; i++) {
            if (sample[i] > max)
                max = sample[i];
            if (sample[i] < min)
                min = sample[i];
        }
        System.out.println("min and max = " + min + " " + max);
        System.out.printf("min and max = %s %s", min, max);
        System.out.println();


        // sorting Arrays

//        int [] nums = {99,-10,18,-978,5623,463,-9,287,49,100123};
//        display original array
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("enter the size of array: ");
        int size = s.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the array elements");
        for (i = 0; i < nums.length; i++) {
            System.out.println("enter element " + i + ":");
            nums[i] = s.nextInt();
        }
        System.out.println("the original array is: ");
        for (i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
        int temp;
        for (i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array is :");
        for (i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
