package by.TMSTasks.lesson6_Objects.Task1_Interface_1;

public class Book implements Printable {
    private String bookName;
    private int booksEdition;

    public String getBookName() {
        return bookName;
    }

    public int getBooksEdition() {
        return booksEdition;
    }

    public Book(String bookName, int booksEdition) {
        this.bookName = bookName;
        this.booksEdition = booksEdition;
    }

    @Override
    public void print() {
        System.out.println(getBookName() + " " + getBooksEdition() + "-й редакции.");
    }

    public static void printBooks(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book) {
                System.out.print(((Book) printable[i]).getBookName() + " ");
            }
        }
    }
}