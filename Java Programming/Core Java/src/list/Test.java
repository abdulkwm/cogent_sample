package list;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private String name;
    private String department;
    private double salary;

    public Test() {
    }

    public Test(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Test> employeeList = new ArrayList<>();
        employeeList.add(new Test("Abdu","It",60000));
        employeeList.add(new Test("Zakir","biology",10000));
        employeeList.add(new Test("ahmed","science",785460));
        employeeList.add(new Test("John","maths",123));
        employeeList.add(new Test("Alex","chem",31400));
        employeeList.add(new Test("jorge","history",632100));
        employeeList.add(new Test("Abel","sport",600310));
        employeeList.stream().filter(emp -> emp.getSalary() > 200000).forEach(System.out::println);
    }
}