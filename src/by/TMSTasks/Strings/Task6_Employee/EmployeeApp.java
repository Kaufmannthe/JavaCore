package by.TMSTasks.Strings.Task6_Employee;


public class EmployeeApp {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Artem", 600);
        Employee employee2 = new Employee("John Bluhborn", 500);
        Employee employee3 = new Employee("Miyazaki", 900);

        Employee[] employees = {employee1, employee2, employee3};

        for (Employee employee : employees){
        Report.generateReport(employee);

        }
    }

}


