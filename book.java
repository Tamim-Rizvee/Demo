
public class book {
    String title, author;
    double price;
    
    book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
