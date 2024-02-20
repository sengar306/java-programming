import java.util.LinkedHashMap;
import java.util.Map;

public class Book {
    public String bookTitle;
    public String authorName;
    public double price;

    public String book_id;
    
    public Book(String book_id,String bookTitle, String authorName, double price) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.book_id=book_id;
    }
    public static void main(String[] args) {
       
        Book book1 = new Book("aa","The man", "ANUPAM", 15.99);
        Book book2 = new Book("bb","R.s AGTRAWAL", "ANJALI RAI", 12.50);
        Book book3 = new Book("cc","THE REVOLUTIONARY", "George", 10.99);
        Book book4 = new Book("dd","The STORY", "V.K", 14.75);
        Book book5 = new Book("ee","Pride and Prejudice", "Ayush", 18.25);
        HashMap<String, Book> bookMap = new HashMap<>();
        bookMap.put(book1.book_id, book1);
        bookMap.put(book2.book_id, book2);
        bookMap.put(book3.book_id, book3);
        bookMap.put(book4.book_id, book4);
        bookMap.put(book5.book_id, book5);
        System.out.println("Book Information:");
        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
            Book book = entry.getValue();
            System.out.println( "book id  :"+ book.book_id+", Title: " + book.bookTitle +
                               ", Author: " + book.authorName +
                               ", Price: $" + book.price);
        }
    }
}
