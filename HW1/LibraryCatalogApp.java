package Pro.Home_Work.HW1;

public class LibraryCatalogApp {

    public static void main(String[] args) {
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        Book book1 = new Book("101", "Книга 1", 1500.0, "A3", "978-3-16-148410-0");
        Book book2 = new Book("102", "Книга 2", 800.0, "B2", "978-3-16-148410-1");
        Journal journal1 = new Journal("101", "Журнал 1", 1200.0, "C5", "7", 2021);
        Journal journal2 = new Journal("102", "Журнал 2", 800.0, "D4", "8", 2022);

        libraryCatalog.addPrintedEdition(book1);
        libraryCatalog.addPrintedEdition(book2);
        libraryCatalog.addPrintedEdition(journal1);
        libraryCatalog.addPrintedEdition(journal2);

        libraryCatalog.displayCatalog();
    }
}