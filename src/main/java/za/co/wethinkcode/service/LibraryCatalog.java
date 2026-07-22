package za.co.wethinkcode.service;

import za.co.wethinkcode.model.*;
import java.util.*;

public class LibraryCatalog {
    private final String libraryName;
    // TODO: Store PrintMedia items in a list
    private List<PrintMedia> printMedia;
    private List<DigitalMedia> digitalMedia;
    // TODO: Store DigitalMedia items in a list

    public LibraryCatalog(String libraryName) {
        this.libraryName = libraryName;
        this.printMedia = new ArrayList<>();
        this.digitalMedia = new ArrayList<>();
    }

    public String getLibraryName() { return libraryName; }

    // TODO: Register PrintMedia
    public void addPrintMedia(PrintMedia item) {
        if (item != null){
            this.printMedia.add(item);
        }
    }

    // TODO: Register DigitalMedia
    public void addDigitalMedia(DigitalMedia item) {
        if (item != null){
            this.digitalMedia.add(item);
        }
    }

    // TODO: Calculate potential late fee for all PrintMedia items for a given number of days overdue.
    // RULE: Only calculate fees for items where isBorrowable() == true!
    public double calculateTotalLateFees(int daysOverdue) {
        double amount = 0.0;
        for (PrintMedia item : printMedia){
            if (item.isBorrowable()){
                amount += item.calculateLateFee(daysOverdue);
            }
        }
        return amount;
    }

    // TODO: Calculate total streaming cost for all DigitalMedia items cataloged.
    public double calculateTotalDigitalStreamCost() {
        double amount =0.0;
        for (DigitalMedia item : digitalMedia){
            amount += item.getStreamCost();
        }
        return amount;
    }

    // TODO: Search for a PrintMedia item by title. Return null if not found.
    public PrintMedia findPrintMediaByTitle(String title) {
        return null;
    }

    // TODO: Return a list containing ONLY PrintMedia items that are currently borrowable (isBorrowable() == true)
    public List<PrintMedia> getBorrowableItems() {
        return null;
    }
}
