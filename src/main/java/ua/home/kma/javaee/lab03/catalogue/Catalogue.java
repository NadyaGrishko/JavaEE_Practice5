package ua.home.kma.javaee.lab03.catalogue;
import java.util.Arrays;
public class Catalogue {
    private String title;
    private Book[] books;

    public Catalogue(String title, Book[] books) {
        this.title = title;
        this.books = books;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "title='" + title + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
