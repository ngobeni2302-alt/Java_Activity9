package za.co.wethinkcode.model;

// TODO: Establish inheritance relationship with MediaItem
public abstract class PrintMedia extends MediaItem{
    // TODO: Fields: isBorrowable (boolean), dailyLateFee (double)
    private boolean isBorrowable;
    private double dailyLateFee;

    public PrintMedia(String itemId, String title, String publisher, int publishYear, double dailyLateFee) {
        // TODO: Call super constructor and set default isBorrowable to true
        super(itemId, title, publisher, publishYear);
        this.dailyLateFee = dailyLateFee;
        isBorrowable = true;
    }

    // TODO: Getters and setters for isBorrowable and dailyLateFee
    public boolean isBorrowable(){return isBorrowable;}
    public double getDailyLateFee(){return this.dailyLateFee;}

    public void setIsBorrowable(boolean borrowable) {
        isBorrowable = borrowable;
    }

    public void setDailyLateFee(double dailyLateFee) {
        this.dailyLateFee = dailyLateFee;
    }

    // TODO: Declare abstract methods:
    // 1. double calculateLateFee(int daysOverdue)
    public abstract double calculateLateFee(int daysOverdue);
    // 2. String getShelfSection()
    public abstract String getShelfSection();
}
