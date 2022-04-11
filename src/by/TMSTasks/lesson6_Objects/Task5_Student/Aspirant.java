package by.TMSTasks.lesson6_Objects.Task5_Student;

public class Aspirant extends Student {
    boolean scienceWork = true;

    @Override
    public void getScholarship() {
        if (getAverageMark() == 5){
            System.out.println(getFirstName() + " " + getLastName() + ", " + getGroup() + ", средний балл: " + getAverageMark() + "\n" +
                    "Степендия учащегося: 200 рублей");
        }else {
            System.out.println(getFirstName() + " " + getLastName() + ", " + getGroup() + ", средний балл: " + getAverageMark() + "\n" +
                    "Степендия учащегося: 180 рублей");
        }
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, boolean scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;


    }

}
