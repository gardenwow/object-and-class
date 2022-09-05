import java.util.Objects;

public class Book {
    private String name;
    private int yearPublish;
    private Author author;
    private String author1;


    public Book(String name, Author author, int yearPublish){
        this.name = name;
        this.yearPublish = yearPublish;
        this.author = author;
    }

    public String getName() {
        return name;
    }
    public int getYearPublish() {
        return yearPublish;
    }
    public void setYearPublish(int yearPublish){
        this.yearPublish = yearPublish;
    }
    public Author getAuthor(){
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublish == book.yearPublish && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearPublish, author);
    }
    //public void setAuthor(String author) {
    //    this.author.setNameAuthor(author);
   // }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", yearPublish=" + yearPublish +
                ", author=" + author +
                ", author1='" + author1 + '\'' +
                '}';
    }
}
