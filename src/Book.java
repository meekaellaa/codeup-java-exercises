public class Book {

    public String title;
    public String author;
    public String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public static void main(String[] args) {
    Book myfirstBook = new Book("The Adventure of Huckleyberry Finn", "Mark Twain", "Classic Lit");
        System.out.println(myfirstBook.author);
        System.out.println(myfirstBook.title);
        System.out.println(myfirstBook.genre);
    }
}
