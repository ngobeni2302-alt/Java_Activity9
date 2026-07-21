package za.co.wethinkcode.model;

// TODO: Inherit from MediaItem
public abstract class DigitalMedia extends MediaItem{
    // TODO: Fields: fileSizeBytes (long), downloadFormat (String)
    private String downloadFormat;
    private long fileSizeBytes;


    public DigitalMedia(String itemId, String title, String publisher, int publishYear, String downloadFormat, long fileSizeBytes) {
        // TODO: Call super constructor
        super(itemId,title,publisher,publishYear);
        this.downloadFormat = downloadFormat;
        // TODO: Validate fileSizeBytes (must be > 0). Throw IllegalArgumentException("File size must be greater than zero") if invalid.
        if (fileSizeBytes <= 0){
            throw new IllegalArgumentException("File size must be greater than zero");
        }
        this.fileSizeBytes = fileSizeBytes;
    }

    // TODO: Getters for downloadFormat and fileSizeBytes
    public String getDownloadFormat(){return this.downloadFormat;}
    public long getFileSizeBytes(){return fileSizeBytes;}

    // TODO: Setter for fileSizeBytes (must also validate > 0)

    public void setFileSizeBytes(long fileSizeBytes) {
        if (fileSizeBytes <= 0){
            throw new IllegalArgumentException("File size must be greater than zero");
        }
        this.fileSizeBytes = fileSizeBytes;
    }

    // TODO: Declare abstract methods:
    // 1. double getStreamCost()
    public abstract double getStreamCost();
    // 2. String getLicenseType()
    public abstract String getLicenseType();
}
