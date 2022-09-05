import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surName;
    private String fullName;

    public String getFullName() {
        return this.nameAuthor + " " + this.surName;
    }

    public Author(String nameAuthor, String surName){
        this.nameAuthor = nameAuthor;
        this.surName = surName;
    }
    public String getNameAuthor() {
        return nameAuthor;
    }
    //public void setNameAuthor(String author){
    //    this.nameAuthor = author;
    //}

    public String getSurName() {
        return surName;
    }
    public String toString(){
        return "name: " + this.nameAuthor + " surname: " + this.surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(surName, author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surName);
    }
}
