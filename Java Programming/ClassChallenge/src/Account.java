public class Account {
    private String number;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private double balance;



    public Account(){
        System.out.println("Empty constructor called");
    }
    public Account(String number,double balance, String customerName, String email, String phone){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }
    public void depositFunds(double depositAmount){
        balance = balance + depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New Balance is $" + balance);
    }
    public void withDrawFunds(double withdrawalAmount){

        if (balance - withdrawalAmount < 0){
            System.out.println("Insufficient Funds! you only have $" + balance + " in your Account");
        }else {
            balance = balance - withdrawalAmount;
            System.out.println("withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
