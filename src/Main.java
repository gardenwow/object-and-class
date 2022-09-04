import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args)throws NullPointerException {
        Book bookOne = new Book("book1", new Author("Ura zdarova"), 1862);
        Book bookTwo = new Book("book2", new Author("Fedor Tytkin"), 1501);
        System.out.println(bookOne.getName()+ " " + bookOne.getAuthor().getNameAuthor() + " " + bookOne.getYearPublish());
        //System.out.println(bookTwo.getName()+ " " + authorBookTwo.getNameAuthor()+ " "+ bookTwo.getYearPublish());
        bookOne.setYearPublish(1897);
        System.out.println(bookOne.getName()+ " " + bookOne.getAuthor().getNameAuthor() + " "+ bookOne.getYearPublish());
        System.out.println(bookTwo.getName()+ " " + bookTwo.getAuthor().getNameAuthor() + " "+ bookTwo.getYearPublish());
        bookTwo.setAuthor("1231234asdf2342");
        System.out.println(bookTwo.getName()+ " " + bookTwo.getAuthor().getNameAuthor() + " "+ bookTwo.getYearPublish());
        System.out.println("=========================");
        Book[] books = new Book[5];
        books[0] = bookOne;
        books[1] = bookTwo;
        Book bookTree = new Book("book3", new Author("123 321"), 1888);
        massiv(books,bookTree);
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                break;
            }
            System.out.println(books[i].getName()+ " " + books[i].getAuthor().getNameAuthor() + " "+ books[i].getYearPublish());
        }
    }
    public static void massiv(Book[] books, Book book){
        for( int i = 0; i < books.length; i ++){
            if (books[i] == null){
                books[i] = book;
                break;
            }
        }
    }
}