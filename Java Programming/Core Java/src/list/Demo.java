package list;

import java.util.Arrays;
import java.util.Comparator;

public class Demo implements Comparator<Demo> {
    int rollNo;
    String name;
    String address;

    public Demo(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public Demo() {

    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compare(Demo o1, Demo o2) {
        return o1.rollNo - o2.rollNo;
    }

    public static void main(String[] args) {
        Demo[] arr = {
                new Demo(444,"Tuba","TX"),
                new Demo(111,"Abdu","OH"),
                new Demo(333,"Maida","NY"),
                new Demo(222,"Zakir","PA")
        };
        System.out.println("Before sorting");
        for (Demo a : arr){
            System.out.println(a);
        }
        System.out.println("After Sorting");
        Arrays.sort(arr,0,3, new Demo());
        for (Demo a : arr){
            System.out.println(a);
        }
        System.out.println("Another sort");
        Arrays.sort(arr, new SortByRoll());
        for (Demo b : arr){
            System.out.println(b);
        }
    }
}
class SortByRoll implements Comparator<Demo> {
    @Override
    public int compare(Demo o1, Demo o2) {
        return o2.rollNo - o1.rollNo;
    }
}