package by.TMSTasks.lesson4;

public class Task5 {
    public static void main(String[] args) {
        float inches = 0;
        int sm = 0;
        while(sm != 10){
            sm++;
            inches = (float) (inches + 2.54);
            System.out.println(sm + "см. = " + inches);
        }
    }
}
