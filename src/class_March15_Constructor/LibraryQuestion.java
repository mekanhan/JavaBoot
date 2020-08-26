package class_March15_Constructor;

public class LibraryQuestion {
    private String bookTitle;
    private String bookAuthor;
    private int ISBN;
    private int numberOfPages;
    private char availability;
    private int borrowDate;
    private int returnDate;


    // Constructor
    LibraryQuestion(String bookTitle, String bookAuthor, int ISBN, int numberOfPages, char availability, int borrowDate, int returnDate) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
        this.availability = 'Y';
        this.borrowDate = 3 / 1 / 2020;
        this.returnDate = 3 / 18 / 2020;
    }

    public int getBorrowDate() {
        return borrowDate;
    }
    public void setBorrowDate(int newBorrowDate) {
        this.borrowDate = 3 / 17 / 2020;
    }
    public int getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(int newReturnDate) {
        this.returnDate = 3 / 20 / 2020;
    }
    public void available() {
        if (borrowDate == 3 / 17 / 2020) {
            System.out.println("Yes, book is available");
        } else {
            System.out.println("No, you have to wait");
        }
    }
    public void returning() {
        if (returnDate == 3 / 18 / 2020) {
            System.out.println("Yes, you are returning in time");
        } else {
            System.out.println("You are late");
        }

    }

    @Override
    public String toString() {
        return "LibraryQuestion{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", ISBN=" + ISBN +
                ", numberOfPages=" + numberOfPages +
                ", availability=" + availability +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
