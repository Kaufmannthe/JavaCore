package by.TMSTasks.lesson7_Strings.Task6_Employee;

public class Report {
    public static void generateReport(Employee employee){
        String string = String.format("Работник %s получил %.2f рублей",employee.getFullName(),employee.getSalary());
        System.out.println(string);
    }
}
