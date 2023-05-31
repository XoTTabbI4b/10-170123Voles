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
            if (printedEdition instanceof Book) {
                Book book = (Book) printedEdition;
                System.out.println("Книга: " + book.getTitle() + " (ISBN: " + book.getISBN() + ")");
            } else if (printedEdition instanceof Journal) {
                Journal journal = (Journal) printedEdition;
                System.out.println("Журнал: " + journal.getTitle() + " (Номер: " + journal.getNumber() + ", Год издания: " + journal.getYear() + ")");
            } else {
                System.out.println("Печатное издание: " + printedEdition.getTitle());
            }
        }
    }
}

