package za.co.wethinkcode.model;

// TODO: Inherit from correct parent class
public class Magazine extends PrintMedia {
    private final int issueNumber;

    public Magazine(String itemId, String title, String publisher, int publishYear, int issueNumber) {
        // TODO: Call super constructor (pass fixed dailyLateFee = 10.00)
        super(itemId,title,publisher,publishYear,10.00);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() { return issueNumber; }

    // TODO: Implement calculateLateFee(int daysOverdue) -> returns 10.00 * daysOverdue
    @Override
    public double calculateLateFee(int daysOverdue){return getDailyLateFee() * daysOverdue;}

    // TODO: Implement getShelfSection() -> returns "Periodicals Section"
    @Override
    public String getShelfSection(){return "Periodicals Section";}

    // TODO: Implement getItemType() -> returns "Magazine Issue"
    @Override
    public String getItemType(){return "Magazine Issue";}
}
