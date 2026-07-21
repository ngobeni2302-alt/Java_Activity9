package za.co.wethinkcode.model;

// TODO: Inherit from DigitalMedia
public class Audiobook extends DigitalMedia {
    public static final double BASE_STREAM_FEE = 15.00;
    public static final double HOUR_RATE = 2.50;

    private int durationHours;

    public Audiobook(String itemId, String title, String publisher, int publishYear, String downloadFormat, long fileSizeBytes, int durationHours) {
        // TODO: Call super constructor
        super(itemId,title,publisher,publishYear,downloadFormat,fileSizeBytes);
        // TODO: Validate durationHours (must be >= 1). Throw IllegalArgumentException if invalid.
        if (durationHours <1){
            throw new IllegalArgumentException("Hours must be greater than or equal to one");
        }
        this.durationHours = durationHours;
    }

    public int getDurationHours() { return durationHours; }

    // TODO: Implement getStreamCost() -> formula: BASE_STREAM_FEE + (durationHours * HOUR_RATE)
    @Override
    public double getStreamCost(){return BASE_STREAM_FEE + (durationHours * HOUR_RATE);}

    // TODO: Implement getLicenseType() -> returns "Single-User Digital Audio"
    @Override
    public String getLicenseType(){return "Single-User Digital Audio";}

    // TODO: Implement getItemType() -> returns "Audiobook"
    @Override
    public String getItemType(){return "Audiobook";}
}
