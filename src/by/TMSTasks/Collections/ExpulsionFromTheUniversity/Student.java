package by.TMSTasks.Collections.ExpulsionFromTheUniversity;

public class Student {
    private String studentName;
    private String studentGroup;
    private int studentCourse;
    private int studentMarks;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    public int getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(int studentCourse) {
        this.studentCourse = studentCourse;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    public Student(String studentName, String studentGroup, int studentCourse, int studentMarks) {
        this.studentName = studentName;
        this.studentGroup = studentGroup;
        this.studentCourse = studentCourse;
        this.studentMarks = studentMarks;
    }

    public Student() {
    }
    public void info(){
        String info = "Учащийся " + getStudentName() + ", группа " + getStudentGroup() +
                ", курс " + getStudentCourse() + ", средний балл " + getStudentMarks();
        System.out.println(info);
    }
}
