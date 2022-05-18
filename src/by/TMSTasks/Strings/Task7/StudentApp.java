package by.TMSTasks.Strings.Task7;

public class StudentApp {
    public static void main(String[] args) {
    someMethod(10,"Артём","Математика");

    }
    public static void someMethod(int grade, String name, String subject){
        System.out.format("Учащийся %-10s получил %-2d по %-10s\n", name,grade,subject);
    }
}
