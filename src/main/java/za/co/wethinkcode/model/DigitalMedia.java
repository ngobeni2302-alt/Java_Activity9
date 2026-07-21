package za.co.wethinkcode.model;

// TODO: Inherit from MediaItem
public class DigitalMedia {
    // TODO: Fields: fileSizeBytes (long), downloadFormat (String)

    public DigitalMedia(String itemId, String title, String publisher, int publishYear, String downloadFormat, long fileSizeBytes) {
        // TODO: Call super constructor
        // TODO: Validate fileSizeBytes (must be > 0). Throw IllegalArgumentException("File size must be greater than zero") if invalid.
    }

    // TODO: Getters for downloadFormat and fileSizeBytes
    // TODO: Setter for fileSizeBytes (must also validate > 0)

    // TODO: Declare abstract methods:
    // 1. double getStreamCost()
    // 2. String getLicenseType()
}
