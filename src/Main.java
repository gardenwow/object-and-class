import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args)throws NullPointerException {
        Author author = new Author("федор", "бречалов");
        Book bookOne = new Book("эмили роуз", author, 1862);
        Book bookTwo = new Book("метро2033", new Author("дмитрий", "глуховский"), 1501);
        System.out.println(bookOne.getName()+ " " + bookOne.getAuthor().getNameAuthor() + " " +bookOne.getAuthor().getSurName()+ " " + bookOne.getYearPublish());
        //System.out.println(bookTwo.getName()+ " " + authorBookTwo.getNameAuthor()+ " "+ bookTwo.getYearPublish());
        bookOne.setYearPublish(1897);
        System.out.println(bookOne.getName()+ " " + bookOne.getAuthor().getFullName() + " "+ bookOne.getYearPublish());
        System.out.println(bookTwo.getName()+ " " + bookTwo.getAuthor().getFullName()+ " " + bookTwo.getYearPublish());
        //bookTwo.setAuthor("1231234asdf2342");
        System.out.println(bookTwo.getName()+ " " + bookTwo.getAuthor().getNameAuthor() + " "+ bookTwo.getYearPublish());
        printScan();
        Book[] books = new Book[5];
        books[0] = bookOne;
        books[1] = bookTwo;
        Book bookTree = new Book("book3", new Author("123 321", "vasyaaa"), 1888);
        massiv(books,bookTree);
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                break;
            }
            System.out.println(books[i].getName()+ " " + books[i].getAuthor().getFullName() + " "+ books[i].getYearPublish());
        }
        printScan();
        System.out.println("bookOne.getAuthor().getFullName() = " + bookOne.getAuthor().getFullName());
        System.out.println("bookOne.getAuthor().toString() = " + bookOne.getAuthor().toString());
        System.out.println("bookOne.hashCode() = " + bookOne.hashCode());
        System.out.println("bookOne.equals() = " + bookOne.equals("sss"));
        System.out.println("bookOne = " + bookOne);
        System.out.println("bookOne.getAuthor() = " + bookOne.getAuthor());
    }
    public static void massiv(Book[] books, Book book){
        for( int i = 0; i < books.length; i ++){
            if (books[i] == null){
                books[i] = book;
                break;
            }
        }
    }
    public static void printScan(){
        System.out.println("=================");
    }
}