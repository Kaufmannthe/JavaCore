package by.tmstasks.objects.student;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void getScholarship(){
        if (getAverageMark() == 5){
            System.out.println(getFirstName() + " " + getLastName() + ", " + getGroup() + ", средний балл: " + getAverageMark() + "\n" +
                    "Степендия учащегося: 100 рублей");
        }else {
            System.out.println(getFirstName() + " " + getLastName() + ", " + getGroup() + ", средний балл: " + getAverageMark() + "\n" +
                    "Степендия учащегося: 80 рублей");
        }
    }
}
