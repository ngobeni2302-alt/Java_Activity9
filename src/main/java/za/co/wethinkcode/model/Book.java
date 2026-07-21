package za.co.wethinkcode.model;

// TODO: Inherit from correct parent class
public class Book {
    private final String isbn;
    private final String author;

    public Book(String itemId, String title, String publisher, int publishYear, String isbn, String author) {
        // TODO: Call super constructor (pass fixed dailyLateFee = 5.00)
        this.isbn = isbn;
        this.author = author;
    }

    public String getIsbn() { return isbn; }
    public String getAuthor() { return author; }

    // TODO: Implement calculateLateFee(int daysOverdue) -> returns 5.00 * daysOverdue
    // TODO: Implement getShelfSection() -> returns "Fiction & Non-Fiction Stacks"
    // TODO: Implement getItemType() -> returns "Printed Book"
}
