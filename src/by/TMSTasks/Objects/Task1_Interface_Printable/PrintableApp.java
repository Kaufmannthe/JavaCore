package by.TMSTasks.Objects.Task1_Interface_Printable;

public class PrintableApp {
    public static void main(String[] args) {
        Magazine magazine1 = new Magazine("Maxim", 1);
        Magazine magazine2 = new Magazine("Maxim", 2);
        Magazine magazine3 = new Magazine("Maxim", 3);

        Book book1 = new Book("Java", 9);
        Book book2 = new Book("Java", 8);
        Book book3 = new Book("Java", 7);

        Printable[] printables = {magazine1, magazine2, magazine3, book1, book2, book3};

        for(Printable printable:printables){
            printable.print();
        }
    }
}