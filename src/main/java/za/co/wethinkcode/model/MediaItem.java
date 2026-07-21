package za.co.wethinkcode.model;

// TODO: Decide if this class should be abstract or concrete
public abstract class MediaItem {
    // TODO: Define private fields (itemId, title, publisher, publishYear)
    private String itemId;
    private String title;
    private String publisher;
    private int publishYear;

    public MediaItem(String itemId, String title, String publisher, int publishYear) {
        // TODO: Initialize fields
        this.itemId = itemId;
        this.title = title;
        this.publisher = publisher;
        this.publishYear = publishYear;
    }

    // TODO: Getters for all fields
    public String getItemId(){return this.itemId;}
    public String getTitle(){return this.title;}
    public String getPublisher(){return this.publisher;}
    public int getPublishYear(){return this.publishYear;}

    // TODO: Setters for mutable fields (title, publisher)

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getFormattedDetails() {
        // TODO: Return string format "title by publisher (publishYear)"
        return this.title + "by "+ this.publisher + "(" + this.publishYear+")";
    }

    // TODO: Declare abstract method: String getItemType()
    public abstract String getItemType();
}
