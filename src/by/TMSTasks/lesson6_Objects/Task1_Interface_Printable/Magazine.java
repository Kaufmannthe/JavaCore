package by.TMSTasks.lesson6_Objects.Task1_Interface_Printable;

public class Magazine implements Printable{
    private String magazineName;
    private int magazineNumber;

    public String getMagazineName() {
        return magazineName;
    }

    public int getMagazineNumber() {
        return magazineNumber;
    }

    public Magazine(String magazineName, int magazineNumber) {
        this.magazineName = magazineName;
        this.magazineNumber = magazineNumber;
    }

    @Override
    public void print() {
        System.out.println(getMagazineName() + " " + getMagazineNumber() + "-й номер выпуска.");
    }
   public static void printMagazines(Printable[]printable){
       for (int i = 0; i < printable.length; i++) {
           if (printable[i] instanceof Magazine){
               System.out.print(((Magazine) printable[i]).getMagazineName() + " ");
           }
       }
    }
}
