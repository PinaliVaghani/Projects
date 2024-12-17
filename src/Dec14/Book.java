package Dec14;

public class Book {
    String name;
    String author;
    double price;
    long Barcode;

    public Book() {
        this.name = "King of wrath";
        this.author = "Ana Huang";
        this.price = 0.0;
        this.Barcode = 6567745;

    }

    public Book(String name) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.Barcode = Barcode;

    }
    public Book(String name , String author) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.Barcode = Barcode;
    }
    public Book(String name , String author , double price , long Barcode) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.Barcode = Barcode;
    }



}

