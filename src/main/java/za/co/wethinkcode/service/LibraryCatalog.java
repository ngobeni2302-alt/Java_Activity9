package za.co.wethinkcode.service;

import za.co.wethinkcode.model.*;
import java.util.*;

public class LibraryCatalog {
    private final String libraryName;
    // TODO: Store PrintMedia items in a list
    // TODO: Store DigitalMedia items in a list

    public LibraryCatalog(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryName() { return libraryName; }

    // TODO: Register PrintMedia
    public void addPrintMedia(PrintMedia item) {
    }

    // TODO: Register DigitalMedia
    public void addDigitalMedia(DigitalMedia item) {
    }

    // TODO: Calculate potential late fee for all PrintMedia items for a given number of days overdue.
    // RULE: Only calculate fees for items where isBorrowable() == true!
    public double calculateTotalLateFees(int daysOverdue) {
        return 0.0;
    }

    // TODO: Calculate total streaming cost for all DigitalMedia items cataloged.
    public double calculateTotalDigitalStreamCost() {
        return 0.0;
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
