package by.TMSTasks.lesson10_Collections.ExpulsionFromTheUniversity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StudentList {
    public static List<Student> listOfStudents = new ArrayList<>();

    public static ArrayList<String> arrayOfNames = new ArrayList<>();
    public static ArrayList<String> arrayOfGroups = new ArrayList<>();

    public void creatingAStudentList() throws IOException {
        Random random = new Random();
        String wayToNames = "src/Resources/ExpulsionFromTheUniversity/StudentNamesTaskExpulsion.txt";
        String wayToGroups = "src/Resources/ExpulsionFromTheUniversity/StudentGroupsTaskExpulsion.txt";

        BufferedReader bufferedReaderForNames = new BufferedReader(new FileReader(wayToNames));
        BufferedReader bufferedReaderForGroups = new BufferedReader(new FileReader(wayToGroups));

        String NameLine;
        String GroupLine;

        while ((NameLine = bufferedReaderForNames.readLine()) != null) {
            arrayOfNames.add(NameLine);
        }
        while ((GroupLine = bufferedReaderForGroups.readLine()) != null) {
            arrayOfGroups.add(GroupLine);
        }

        for (int i = 0; i < 20; i++) {

            int randomStudentName = random.nextInt(0, arrayOfNames.size());
            int randomStudentGroup = random.nextInt(0, arrayOfGroups.size());
            int randomStudentCourse = random.nextInt(1, 4);
            int randomStudentAverageMark = random.nextInt(1, 10);

            Student student = new Student(arrayOfNames.get(randomStudentName), arrayOfGroups.get(randomStudentGroup),
                    randomStudentCourse, randomStudentAverageMark);
            listOfStudents.add(student);
        }
    }

    public void mainMenu() throws IOException {
        Scanner scannerMainMenu = new Scanner(System.in);
        creatingAStudentList();
        String mainMenuString = """
                _____________________________________________
                1.Список студентов.
                2.Исключить студентов с плохой успеваемостью.
                3.Перевести студентов на следующий курс.
                4.Выход.
                _____________________________________________""";
        System.out.println(mainMenuString);
        int checkInt = scannerMainMenu.nextInt();
        switch (checkInt) {
            case 1 -> showStudentList();
            case 2 -> expulsion();
            case 3 -> gradeUp();
            case 4 -> exit();
            default -> {
                String failure = "Ошибка ввода. Возврат в главное меню";
                System.err.println(failure);
                mainMenuShortCut();
            }
        }
    }

    public void mainMenuShortCut() throws IOException {
        Scanner scannerMainMenuShortCut = new Scanner(System.in);
        String mainMenuString = """
                _____________________________________________
                1.Список студентов.
                2.Исключить студентов с плохой успеваемостью.
                3.Перевести студентов на следующий курс.
                4.Выход.
                _____________________________________________""";
        System.out.println(mainMenuString);
        int checkInt = scannerMainMenuShortCut.nextInt();
        switch (checkInt) {
            case 1 -> showStudentList();
            case 2 -> expulsion();
            case 3 -> gradeUp();
            case 4 -> exit();
            default -> {
                String failure = "Ошибка ввода. Возврат в главное меню";
                System.err.println(failure);
                mainMenuShortCut();
            }
        }
    }

    public void exit() {
        String exit = "Выход из программы.";
        System.out.println(exit);
    }

    public void expulsion() throws IOException {
        Iterator<Student> iterator = listOfStudents.iterator();
        int minimalMark = 3;
        String expulsionStudent = "Исключённые студенты:";
        System.out.println(expulsionStudent);
        while (iterator.hasNext()) {
            Student student = iterator.next();//Iterator
            if (minimalMark >= student.getStudentMarks()) {
                student.info();
                iterator.remove();
            }
        }
        toContinue();
    }
    public void gradeUp() throws IOException {
        Iterator<Student> iterator = listOfStudents.iterator();
        int minimalMark = 3;
        String gradeUpStudent = "Студенты, которые переведены на следующий курс";
        System.out.println(gradeUpStudent);
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (minimalMark < student.getStudentMarks() && student.getStudentCourse() < 4){
                student.info();
                int studentCourse = student.getStudentCourse();
                student.setStudentCourse(studentCourse + 1);
            }
        }
        toContinue();
    }




    public void showStudentList() throws IOException {
        for (Student student : listOfStudents){
            student.info();
        }
        toContinue();
    }
    public void toContinue() throws IOException {
        System.out.println();
        Scanner toContinueStringScanner = new Scanner(System.in);

        String continueString = "Вы хотите продолжить? 1.Да, 2.Нет";
        System.out.println(continueString);

        int intToContinue = toContinueStringScanner.nextInt();
        switch (intToContinue) {
            case 1 -> {
                System.out.println();
                mainMenuShortCut();
            }
            case 2 -> {
                System.out.println();
                exit();
                //Метод, который направлен на уточнение у пользователя о желании продолжать работать.
                //Ввод команд через консоль.
            }
        }
    }


}
