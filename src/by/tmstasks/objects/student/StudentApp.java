package by.tmstasks.objects.student;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student("Artyom","Bokhan","D-691",4.9);
        Student aspirant = new Aspirant("Aspirant","Aspirantovich","K-701",5,true);

        Student[] array = {student,aspirant};

        for (Student student1 : array){
            student1.getScholarship();
        }
    }
}
