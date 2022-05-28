package by.tmstasks.objects.reader;

public class Reader {
    private String readerName;
    private int libraryCard;
    private String faculty;
    private String birth;
    private int mobileNumber;


    public String getReaderName() {
        return readerName;
    }

    public Reader(String readerName, int libraryCard, String faculty, String birth, int mobileNumber) {
        this.readerName = readerName;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.birth = birth;
        this.mobileNumber = mobileNumber;

    }

    public void takeBook(int a) {
        if (a % 2 == 1){
        System.out.println(getReaderName() + " взял " + a + " книгу.");
    }else {
            System.out.println(getReaderName() + " взял " + a + " книг");
        }
    }

    public void takeBook(String a) {
        System.out.println(getReaderName() + " взял следующие книги: " + a + ".");
    }

    public void returnBook(int a) {
        System.out.println(getReaderName() + " вернул " + a + " книги.");
    }

    public void returnBook(String a) {
        System.out.println(getReaderName() + " вернул следующие книги: " + a + ".");
    }
}

