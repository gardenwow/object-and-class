public class Book {
    private String name;
    private int yearPublish;
    private Author author;

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

    public void setAuthor(String author) {
        this.author.setNameAuthor(author);
    }
}
