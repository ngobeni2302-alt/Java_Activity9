package za.co.wethinkcode.model;

// TODO: Inherit from correct parent class
public class Magazine {
    private final int issueNumber;

    public Magazine(String itemId, String title, String publisher, int publishYear, int issueNumber) {
        // TODO: Call super constructor (pass fixed dailyLateFee = 10.00)
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() { return issueNumber; }

    // TODO: Implement calculateLateFee(int daysOverdue) -> returns 10.00 * daysOverdue
    // TODO: Implement getShelfSection() -> returns "Periodicals Section"
    // TODO: Implement getItemType() -> returns "Magazine Issue"
}
