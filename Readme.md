# Activity 9: Library Media Management System

An Object-Oriented Java application that models media items (books, magazines, audiobooks) in a library system using abstract classes, inheritance, encapsulation, and unit testing.

---

## 🎯 Learning Objectives
- **Abstraction:** Design abstract base classes (`MediaItem`, `PrintMedia`, `DigitalMedia`) with abstract methods that force concrete subclasses to define specific behaviors.
- **Inheritance:** Leverage multi-level class hierarchies to reuse fields and methods across item types.
- **Encapsulation & Validation:** Protect member variables using private access modifiers and throw `IllegalArgumentException` on invalid inputs.
- **Polymorphism & Collections:** Process collections of items dynamically in `LibraryCatalog`.

---

## 🏗️ Domain & Class Hierarchy

                  ┌──────────────────┐
                  │    MediaItem     │ (Abstract Base)
                  └────────┬─────────┘
                           │
        ┌──────────────────┴──────────────────┐
        ▼                                     ▼

┌─────────────────┐                  ┌───────────────────┐
│   PrintMedia    │ (Abstract)       │   DigitalMedia    │ (Abstract)
└────────┬────────┘                  └─────────┬─────────┘
│                                     │
┌───────┴───────┐                             ▼
▼               ▼                     ┌───────────────┐
┌───────┐     ┌──────────┐                │   Audiobook   │ (Concrete)
│ Book  │     │ Magazine │                └───────────────┘
└───────┘     └──────────┘


---

## 📋 Specific Implementation Rules

### 1. `MediaItem` (Abstract Class)
- **Fields:** `itemId` (String), `title` (String), `publisher` (String), `publishYear` (int).
- **Method `getFormattedDetails()`:** Returns `"title by publisher (publishYear)"`.
- **Abstract Method:** `String getItemType()`.

### 2. `PrintMedia` (Abstract Class)
- **Inherits:** `MediaItem`
- **Fields:** `isBorrowable` (boolean, default: `true`), `dailyLateFee` (double).
- **Abstract Methods:**
    - `double calculateLateFee(int daysOverdue)`
    - `String getShelfSection()`

### 3. Concrete Print Items
- **`Book`:**
    - **Extra Fields:** `isbn`, `author`.
    - Fixed late fee rate: **R5.00/day**.
    - Section: `"Fiction & Non-Fiction Stacks"`.
    - Type: `"Printed Book"`.
- **`Magazine`:**
    - **Extra Field:** `issueNumber`.
    - Fixed late fee rate: **R10.00/day**.
    - Section: `"Periodicals Section"`.
    - Type: `"Magazine Issue"`.

### 4. `DigitalMedia` (Abstract Class)
- **Inherits:** `MediaItem`
- **Fields:** `downloadFormat` (String), `fileSizeBytes` (long).
- **Validation:** `fileSizeBytes` **must be > 0**; otherwise throw `IllegalArgumentException`.
- **Abstract Methods:**
    - `double getStreamCost()`
    - `String getLicenseType()`

### 5. `Audiobook` (Concrete Class)
- **Inherits:** `DigitalMedia`
- **Extra Field:** `durationHours` (int).
- **Validation:** `durationHours` **must be >= 1**; otherwise throw `IllegalArgumentException`.
- **Formula:** `getStreamCost()` = `15.00 + (durationHours * 2.50)`.
- **License Type:** `"Single-User Digital Audio"`.
- **Type:** `"Audiobook"`.

### 6. `LibraryCatalog` (Service Class)
- Stores `List<PrintMedia>` and `List<DigitalMedia>`.
- **`calculateTotalLateFees(int daysOverdue)`:** Calculates total late fees, but **ONLY** for items where `isBorrowable() == true`.
- **`getBorrowableItems()`:** Filters and returns only borrowable print items.
- **`findPrintMediaByTitle(String title)`:** Searches for a print item by title (returns `null` if not found).

---

## 🛠️ How to Run Tests

Run the following command in your project root:

```bash
mvn test