public class Author {
    private String nameAuthor;
    private String surName;

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
}
