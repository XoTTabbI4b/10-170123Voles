package Pro.Home_Work.HW1;

class Journal extends PrintedEdition {
    private String number; // Номер журнала
    private int year; // Год издания

    public Journal(String catalogNumber, String title, double price, String shelfLocation, String number, int year) {
        super(catalogNumber, title, price, shelfLocation);
        this.number = number;
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }
}
