package Pro.Home_Work.HW1;

import java.util.ArrayList;
import java.util.List;

class LibraryCatalog {
    private List<PrintedEdition> catalog;

    public LibraryCatalog() {
        catalog = new ArrayList<>();
    }

    public void addPrintedEdition(PrintedEdition printedEdition) {
        catalog.add(printedEdition);
    }

    public void displayCatalog() {
        for (PrintedEdition printedEdition : catalog) {
            String details = printedEdition.getTitle();

            if (printedEdition instanceof Book) {
                Book book = (Book) printedEdition;
                details += " (ISBN: " + book.getISBN() + ")";
            } else if (printedEdition instanceof Journal) {
                Journal journal = (Journal) printedEdition;
                details += " (Номер: " + journal.getNumber() + ", Год издания: " + journal.getYear() + ")";
            }

            System.out.println("Печатное издание: " + details);
        }
    }
}
