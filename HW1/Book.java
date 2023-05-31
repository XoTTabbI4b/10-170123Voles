package Pro.Home_Work.HW1;

class Book extends PrintedEdition {
    private String isbn; // Номер ISBN

    public Book(String catalogNumber, String title, double price, String shelfLocation, String isbn) {
        super(catalogNumber, title, price, shelfLocation);
        this.isbn = isbn;
    }

    public String getISBN() {
        return isbn;
    }
}
