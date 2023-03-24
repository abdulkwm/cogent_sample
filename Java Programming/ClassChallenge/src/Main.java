public class Main {
    public static void main(String[] args) {

        //Account
        Account abdusAccount = new Account("123",500,"abdulkerim",
                "abdu0921@hotmail.com","(614) 302-1212");
        System.out.println(abdusAccount.getNumber());
        System.out.println(abdusAccount.getBalance());

//        Account abdusAccount = new Account();
//        abdusAccount.setBalance(123);
//        abdusAccount.setCustomerEmail("abdu78@gmail.com");
//        abdusAccount.setCustomerName("Abdulkerim Mohammed");
//        abdusAccount.setCustomerPhone("(614) 123- 1234");
//        abdusAccount.withDrawFunds(123.0);
//        abdusAccount.depositFunds(250);
//        abdusAccount.withDrawFunds(12);
//        abdusAccount.withDrawFunds(230);
//        abdusAccount.withDrawFunds(12);

        // simpleCalculator
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5);
        simpleCalculator.setSecondNumber(4);
        System.out.println("add= " + simpleCalculator.getAdditionResult());
        System.out.println("subtract= " + simpleCalculator.getSubtractionResult());
        System.out.println("multiply= " + simpleCalculator.getMultiplicationResult());
        System.out.println("divide= " + simpleCalculator.getDivisionResult());
        simpleCalculator.getAdditionResult();
        simpleCalculator.getSubtractionResult();
        simpleCalculator.getMultiplicationResult();
        simpleCalculator.getDivisionResult();

        // Person
        Person person = new Person();
        person.setFirstName("Abdulkerim");
        person.setLastName("");
        person.setAge(23);

        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());


        // Customer

        Customer customer = new Customer("abdu",2000,"abdu0921@gmail.com");
        System.out.println("customer challenge");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer customer1 = new Customer("abdu","abdu0921@hotmail.com");
        System.out.println("customer1 = " + customer1.getName() + " " + customer1.getEmail() + " " + customer1.getCreditLimit());
    }
}
