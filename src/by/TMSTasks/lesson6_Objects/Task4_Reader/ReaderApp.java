package by.TMSTasks.lesson6_Objects.Task4_Reader;

public class ReaderApp {
    public static void main(String[] args) {
        Reader petrov = new Reader("Петров П.П.",170,"Экономический факультет",
                "17.02.1999",5121346);
        Book onegin = new Book("А.С. Пушкин","Евгений Онегин");
        petrov.takeBook(1);
        onegin.bookInfo();
    }
}
