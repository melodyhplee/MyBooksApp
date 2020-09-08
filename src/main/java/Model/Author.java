package Model;

import java.util.Objects;

public class Author {
    private String name;
    private int numberOfBooks;
    private String nationality;

    //This only shows on featureB

    public Author(String name, int numberOfBooks, String nationality) {
        this.name = name;
        this.numberOfBooks = numberOfBooks;
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getNumberOfBooks() == author.getNumberOfBooks() &&
                Objects.equals(getName(), author.getName()) &&
                Objects.equals(getNationality(), author.getNationality());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumberOfBooks(), getNationality());
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", numberOfBooks=" + numberOfBooks +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public String getNationality() {
        return nationality;
    }
}
