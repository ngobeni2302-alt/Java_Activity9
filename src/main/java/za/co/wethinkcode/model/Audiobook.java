package za.co.wethinkcode.model;

// TODO: Inherit from DigitalMedia
public class Audiobook {
    public static final double BASE_STREAM_FEE = 15.00;
    public static final double HOUR_RATE = 2.50;

    private int durationHours;

    public Audiobook(String itemId, String title, String publisher, int publishYear, String downloadFormat, long fileSizeBytes, int durationHours) {
        // TODO: Call super constructor
        // TODO: Validate durationHours (must be >= 1). Throw IllegalArgumentException if invalid.
        this.durationHours = durationHours;
    }

    public int getDurationHours() { return durationHours; }

    // TODO: Implement getStreamCost() -> formula: BASE_STREAM_FEE + (durationHours * HOUR_RATE)
    // TODO: Implement getLicenseType() -> returns "Single-User Digital Audio"
    // TODO: Implement getItemType() -> returns "Audiobook"
}
