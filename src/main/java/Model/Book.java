package Model;

import java.util.Objects;

public class Book {
    private String title;
    private String isbn;
    private String publisher;
    private int year;
    private String author;

    public Book(String title, String isbn, String publisher, int year, String author) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.year = year;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book author1 = (Book) o;
        return getYear() == author1.getYear() &&
                Objects.equals(getTitle(), author1.getTitle()) &&
                Objects.equals(getIsbn(), author1.getIsbn()) &&
                Objects.equals(getPublisher(), author1.getPublisher()) &&
                Objects.equals(getAuthor(), author1.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getIsbn(), getPublisher(), getYear(), getAuthor());
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
