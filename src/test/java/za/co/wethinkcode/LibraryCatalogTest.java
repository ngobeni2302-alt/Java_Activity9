package za.co.wethinkcode;

import org.junit.jupiter.api.Test;
import za.co.wethinkcode.model.*;
import za.co.wethinkcode.service.LibraryCatalog;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryCatalogTest {

    @Test
    public void testBookImplementation() {
        Book book = new Book("BK-01", "Clean Code", "Prentice Hall", 2008, "978-0132350884", "Robert C. Martin");
        assertEquals(15.00, book.calculateLateFee(3)); // 3 days * 5.00
        assertEquals("Fiction & Non-Fiction Stacks", book.getShelfSection());
        assertEquals("Printed Book", book.getItemType());
        assertEquals("Clean Code by Prentice Hall (2008)", book.getFormattedDetails());
    }

    @Test
    public void testMagazineImplementation() {
        Magazine magazine = new Magazine("MAG-01", "National Geographic", "NatGeo Society", 2024, 152);
        assertEquals(20.00, magazine.calculateLateFee(2)); // 2 days * 10.00
        assertEquals("Periodicals Section", magazine.getShelfSection());
        assertEquals("Magazine Issue", magazine.getItemType());
        assertEquals(152, magazine.getIssueNumber());
    }

    @Test
    public void testAudiobookCalculationAndValidation() {
        // Base 15.00 + (10 hours * 2.50) = 40.00
        Audiobook book = new Audiobook("AB-01", "Atomic Habits", "Penguin", 2018, "MP3", 500000000L, 10);
        assertEquals(40.00, book.getStreamCost());
        assertEquals("Single-User Digital Audio", book.getLicenseType());

        // File size validation test
        assertThrows(IllegalArgumentException.class, () -> {
            new Audiobook("AB-02", "Bad File", "Test", 2020, "MP3", -500L, 5);
        });

        // Duration validation test
        assertThrows(IllegalArgumentException.class, () -> {
            new Audiobook("AB-03", "Zero Duration", "Test", 2020, "MP3", 1000L, 0);
        });
    }

    @Test
    public void testCatalogServiceLogic() {
        LibraryCatalog catalog = new LibraryCatalog("Central Johannesburg Public Library");

        Book book1 = new Book("BK-01", "Design Patterns", "Addison-Wesley", 1994, "978-0201633610", "Gang of Four");
        Book book2 = new Book("BK-02", "Refactoring", "Addison-Wesley", 1999, "978-0201485677", "Martin Fowler");
        
        // Mark book2 as not borrowable (reference only)
        book2.setIsBorrowable(false);

        catalog.addPrintMedia(book1);
        catalog.addPrintMedia(book2);

        // 2 days overdue -> book1 (2 * 5.00 = 10.00), book2 ignored because isBorrowable is false
        assertEquals(10.00, catalog.calculateTotalLateFees(2));

        // Test borrowable list filtering
        assertEquals(1, catalog.getBorrowableItems().size());

        // Test search
        assertEquals(book1, catalog.findPrintMediaByTitle("Design Patterns"));
        assertNull(catalog.findPrintMediaByTitle("Unknown Book"));
    }
}
