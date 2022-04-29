package by.TMSTasks.lesson7_Strings.Task7;

public class Student {
    private int studentGrade;
    private String studentName;
    private String studentSubject;

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSubject() {
        return studentSubject;
    }

    public void setStudentSubject(String studentSubject) {
        this.studentSubject = studentSubject;
    }

    public Student() {
    }

    public Student(int studentGrade, String studentName, String studentSubject) {
        this.studentGrade = studentGrade;
        this.studentName = studentName;
        this.studentSubject = studentSubject;
    }

}

