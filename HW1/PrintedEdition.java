package Pro.Home_Work.HW1;

class PrintedEdition {
    private String catalogNumber; // Каталожный номер
    private String title; // Название
    private double price; // Балансовая стоимость
    private String shelfLocation; // Место на полке
    private String issuedTo; // Посетителю, которому выдано

    public PrintedEdition(String catalogNumber, String title, double price, String shelfLocation) {
        this.catalogNumber = catalogNumber;
        this.title = title;
        this.price = price;
        this.shelfLocation = shelfLocation;
        this.issuedTo = "";
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(String visitor) {
        this.issuedTo = visitor;
    }

    public boolean isAvailable() {
        return issuedTo.isEmpty();
    }
}
