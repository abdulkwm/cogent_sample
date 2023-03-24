public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim","11/11/1985",
                "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("joe","11/11/1990","02/03/2020",35000);
        System.out.println(joe);
        System.out.println("joe's paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("joe;s pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","05/07/1999",
                "03/05/2020",20);
        System.out.println(mary);
        System.out.println("mary's paycheck = $" + mary.collectPay());
        System.out.println("mary's holiday pay = $" + mary.getDoublePay());
    }
}