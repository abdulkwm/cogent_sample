import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
    Map<String,Book> bookCollection = new HashMap<>();
    // properties/Fields/Global Variables
    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7;
    double initialFee = 0.50;
    double feePerLateDay = 1.00;

    // Constructors
    public LibraryCatalogue() {
    }

    public LibraryCatalogue(Map<String, Book> bookCollection, int lengthOfCheckOutPeriod, double initialFee, double feePerLateDay) {
        this.bookCollection = bookCollection;
        this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
        this.initialFee = initialFee;
        this.feePerLateDay = feePerLateDay;
    }

    public LibraryCatalogue(Map<String,Book> bookCollection) {
    }

    // Getter

    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }
    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public int getLengthOfCheckOutPeriod() {
        return lengthOfCheckOutPeriod;
    }

    public double getInitialFee() {
        return initialFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }
    // Setter
    public void nextDay(){
        currentDay++;
    }
    public void setDay(int day){
        currentDay = day;
    }
    // Instance Method

    public void checkOutBook(String title){
        Book book = getBook(title);
        if (book.isCheckedOut()){
            sorryBookAlreadyCheckedOut(book);
        }else {
            book.setCheckedOut(true, currentDay);
            System.out.println("you just checked out " + title + " .It is due on day " + (getCurrentDay() + getLengthOfCheckOutPeriod())
            + ".");
        }
    }
    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckOutPeriod());
        if (daysLate > 0){
            System.out.println("you oww the library $" + (getInitialFee() + daysLate * getFeePerLateDay()) +
                    " because your book is " + daysLate + "days overdue.");
        }else {
            System.out.println("Book Returned. ThankYou");
        }
        book.setCheckedOut(false, -1);
    }
    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("sorry " + book.getTitle()+ " is already checked out. " + "It should be back on day " + 
                (book.getDayCheckedOut() + getLengthOfCheckOutPeriod()) + ".");

    }
    public static void main(String[] args) {
    
        Map<String,Book> bookCollection = new HashMap<>();
        Book harry = new Book("Harry Potter",367,37372);
        bookCollection.put("Harry Potter",harry);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Harry Potter");
    }
}