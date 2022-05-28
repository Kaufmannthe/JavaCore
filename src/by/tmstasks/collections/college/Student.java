package by.tmstasks.collections.college;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Student implements Comparable<Student> {
    static List<Student> studentList = new ArrayList<>();

    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentFaculty;
    private int studentCourse;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentFaculty() {
        return studentFaculty;
    }

    public void setStudentFaculty(String studentFaculty) {
        this.studentFaculty = studentFaculty;
    }

    public int getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(int studentCourse) {
        this.studentCourse = studentCourse;
    }

    public Student() {
    }

    public Student(int studentId, String studentName, int studentAge, String studentFaculty, int studentCourse) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentFaculty = studentFaculty;
        this.studentCourse = studentCourse;

    }
    //______________________________________________________________
    String[] arrayOfFaculties = new String[5];
    String[] arrayOfNames = new String[20];

    public void mainMenu() throws IOException {
        creatingOfStudents();
        Scanner mainMenuCheck = new Scanner(System.in);
        String mainMenuWelcome = """
                Добро пожаловать в главное меню.
                Все переходы в программе осуществляются через цифры.
                                
                1.Добавить нового студента.
                2.Список студентов.
                3.Обновить данные о студенте.
                4.Удалить студента.
                5.Выход из программы.
                ---------------------------------
                Выберите действие.""";
        System.out.println(mainMenuWelcome);
        int mainMenuInt = mainMenuCheck.nextInt();
        String error = "Ошибка ввода. Повторите попытку.";
        switch (mainMenuInt) {
            case 1 -> addANewStudent();
            case 2 -> studentsInfo();
            case 3 -> studentUpdate();
            case 4 -> studentDelete();
            case 5 -> exit();
            default -> {
                System.err.println(error);
                mainMenu();
            }
        }

    }

    private void studentDelete() throws IOException {
        Scanner scannerStudentDelete = new Scanner(System.in);
        studentsShortcutInfo();
        String menuString = "Укажите ID студента, которого хотите удалить.";
        System.out.println(menuString);
        int deleting = scannerStudentDelete.nextInt();
        Iterator<Student> studentIterator = studentList.iterator();

        while (studentIterator.hasNext()){
            int intToDeleteStudent = studentIterator.next().getStudentId();
            if (intToDeleteStudent == deleting){
            studentIterator.remove();
            String success = "Студент успешно исключён из списка.";
                System.out.println(success);
                toContinue();
            }if (!studentIterator.hasNext()){
                String failure = "Данный студент не найден. Попробуйте снова.";
                System.err.println(failure);
                studentDelete();
            }
        }
    }

    private void studentUpdate() throws IOException {
        Scanner scannerForStudentUpdate = new Scanner(System.in);
        Scanner scannerForStudentUpdateString = new Scanner(System.in);
        studentsShortcutInfo();
        String studentUpdateInfo = "\nУкажите ID студента, которого хотите обновить.";

        System.out.println(studentUpdateInfo);
        int studentUpdateCheck = scannerForStudentUpdate.nextInt();

        for (Student students : studentList) {
            int idCheck = students.getStudentId();
            if (studentUpdateCheck == idCheck) {
                String studentUpdateMenu = """
                                                
                        1.Изменить ID
                        2.Изменить имя
                        3.Изменить возраст
                        4.Изменить факультет.
                        5.Изменить курс.
                        6.Вернуться в главное меню.
                        ----------------------------
                        Выберите пункт.""";
                students.info();
                System.out.println(studentUpdateMenu);
                int studentUpdateMenuCheck = scannerForStudentUpdate.nextInt();

                switch (studentUpdateMenuCheck) {
                    case 1 -> {
                        String idUpdate = "Укажите новый ID.";
                        System.out.println(idUpdate);
                        int id = scannerForStudentUpdate.nextInt();
                        for (Student student1 : studentList) {
                            if (student1.getStudentId() != id && id != 101) {
                                students.setStudentId(id);
                                String success = "\nID студента успешно изменено:";
                                System.out.println(success);
                                students.info();
                                toContinue();
                            }
                            if (id > 100 || id < 0) {
                                String failure = "Ошибка. ID не может быть больше 100. Попробуйте заново.";
                                System.err.println(failure);
                                studentUpdate();
                            }else {
                                String failure = "Ошибка. Данный ID уже существует. Попробуйте заново.";
                                System.err.println(failure);
                                studentUpdate();
                            }
                        }
                    }
                    case 2 -> {
                        String nameUpdate = "Укажите новое имя.";
                        System.out.println(nameUpdate);
                        String name = scannerForStudentUpdateString.nextLine();
                        students.setStudentName(name);
                        String success = "Имя студента обновлено.";
                        System.out.println(success);
                        students.info();
                        toContinue();
                    }
                    case 3 -> {
                        String ageUpdate = "Укажите текущий возраст студента.";
                        System.out.println(ageUpdate);
                        int age = scannerForStudentUpdate.nextInt();
                        if (age > 14 && age < 100) {
                            students.setStudentAge(age);
                            String success = "Возвраст студента успешно изменён.";
                            System.out.println(success);
                            toContinue();
                        }
                            String failure = "Ошибка. Возраст учащегося не может быть меньше 14 и больше 100 лет. Попробуйте заново.";
                            System.err.println(failure);
                            studentUpdate();
                    }
                    case 4 -> {
                        for (int i = 0, count = 1; i < arrayOfFaculties.length; i++, count++) {
                            System.out.println(count + "." + arrayOfFaculties[i]);
                        }
                        String facultyUpdate = "Укажите факультет.";
                        System.out.println(facultyUpdate);
                        int faculty = scannerForStudentUpdate.nextInt();

                        switch (faculty) {
                            case 1 -> students.setStudentFaculty(arrayOfFaculties[0]);
                            case 2 -> students.setStudentFaculty(arrayOfFaculties[1]);
                            case 3 -> students.setStudentFaculty(arrayOfFaculties[2]);
                            case 4 -> students.setStudentFaculty(arrayOfFaculties[3]);
                            case 5 -> students.setStudentFaculty(arrayOfFaculties[4]);
                            default -> {
                                String failure = "Укажите факультет цифрой, что указаны выше.";
                                System.err.println(failure);
                                studentUpdate();
                            }
                        }
                        students.info();
                        toContinue();
                    }
                    case 5 -> {
                        String courseUpdate = "Укажите курс студента.\nОбратите внимание, что в колледже выпускной курс - 4-ый.";
                        System.out.println(courseUpdate);
                        int course = scannerForStudentUpdate.nextInt();
                        if (course < 5 && course > 0){
                            students.setStudentCourse(course);
                            String success = "Курс успешно изменён.";
                            System.out.println(success);
                            students.info();
                            toContinue();
                        }
                            String failure = "Ошибка ввода. В колледже начинающий курс 1-ый, а выпускной 4-ый. Возврат в редактор.";
                            System.err.println(failure);
                            studentUpdate();
                    }
                    case 6 -> {
                        String backToMenu = "Возврат в главное меню.";
                        System.out.println(backToMenu);
                        mainMenu();
                    }
                }
            }
        }
        String failure = "Ошибка. Возврат в редактор.";
        System.err.println(failure);
        studentUpdate();
    }

    public void creatingOfStudents() throws IOException {
        Random random = new Random();

        String wayToNames = "src/Resources/College/studentNamesTaskCollege.txt";
        String wayToFaculty = "src/Resources/College/studentFacultyTaskCollege.txt";

        BufferedReader bufferedReaderForNames = new BufferedReader(new FileReader(wayToNames));
        BufferedReader bufferedReaderForFaculty = new BufferedReader(new FileReader(wayToFaculty));

        String studentClassStudentName;
        String studentClassFaculty;


        for (int i = 0; i < arrayOfFaculties.length &&
                (studentClassFaculty = bufferedReaderForFaculty.readLine()) != null; i++) {
            arrayOfFaculties[i] = studentClassFaculty;      //Запись строк из файла в массив.
            //Сделать то же самое с именами.
            //Раскидать по методам.
        }
        for (int i = 0; i < arrayOfNames.length
                && ((studentClassStudentName = bufferedReaderForNames.readLine()) != null); i++) {
            arrayOfNames[i] = studentClassStudentName;
        }


        for (int i = 0; i < arrayOfNames.length; i++) {
            int randomIntID = random.nextInt(1, 100);
            int randomIntAge = random.nextInt(16, 25);
            int randomIntCourse = random.nextInt(1, 4);
            int randomIntFaculties = random.nextInt(0, 5);
            int randomIntNames = random.nextInt(0, 20);
            Student student = new Student(randomIntID, arrayOfNames[randomIntNames], randomIntAge, arrayOfFaculties[randomIntFaculties], randomIntCourse);
            Student.studentList.add(student);


        }

    }

    public void addANewStudent() throws IOException {
        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        String studentIdString = """
                                
                Создание студента.
                                
                Введите ID студента:""";

        System.out.println(studentIdString);

        int scannerStudentID = intScanner.nextInt();
        for (Student students : studentList) {
            int idCheck = students.getStudentId();
            if (scannerStudentID == idCheck) {
                String result = "Студент с таким ID уже существует: ";
                System.out.println(result);
                students.info();

                String userCheck = "Вы хотите продолжить? 1.Да, 2. Нет";
                System.out.println(userCheck);
                int checkInt = intScanner.nextInt();

                switch (checkInt) {
                    case 1 -> addANewStudent();
                    case 2 -> exit();
                }
            }

        }
            String studentNameString = "Введите имя";
            System.out.println(studentNameString);
            String scannerStudentName = stringScanner.nextLine();

            String studentAgeString = "Введите возраст";
            System.out.println(studentAgeString);
            int scannerStudentAge = intScanner.nextInt();

            String studentFacultyString = "Выберите факультет:";
            System.out.println(studentFacultyString);
            for (int i = 0, count = 1; i < arrayOfFaculties.length; i++, count++) {
                String result = count + "." + arrayOfFaculties[i];
                System.out.println(result);
            }

            int scannerStudentFaculty = intScanner.nextInt();
            String switchUserFaculty = null;
            String error = "Ошибка ввода. Необходимо выбрать факультет из представленных выше. Возврат в главное меню.";
            switch (scannerStudentFaculty) {
                case 1 -> switchUserFaculty = "Экономический факультет";
                case 2 -> switchUserFaculty = "Исторический факультет";
                case 3 -> switchUserFaculty = "Филологический факультет";
                case 4 -> switchUserFaculty = "Физико - химический факультет";
                case 5 -> switchUserFaculty = "Факультет мировых отношений";
                default -> {
                    mainMenu();
                    System.err.println(error);

                }

            }
            int studentCourse = 1;

            Student student = new Student(scannerStudentID, scannerStudentName, scannerStudentAge, switchUserFaculty, studentCourse);
            studentList.add(student);
            String success = "Новый студент успешно добавлен:";
        System.out.println(success);
            student.info();
            toContinue();
        }

    public void info() {

        String info = getStudentId() + ", " + getStudentName() + ", " + getStudentAge() + ", "
                + getStudentFaculty() + ", " + getStudentCourse();
        System.out.println(info);
    }

    public void exit(){
        String programExit = "\n\nВыход из программы.";
        System.err.println(programExit);
    }

    public void studentsInfo() throws IOException {
        Scanner scannerForStudentsInfo = new Scanner(System.in);
        for (Student students : studentList){
            String info = students.getStudentId() + ", " + students.getStudentName() + ", " + students.getStudentAge() + ", "
                    + students.getStudentFaculty() + ", " + students.getStudentCourse();
            System.out.println(info);
        }
        String sorting = """
                
                1.Отсортировать по имени.
                2.Отсортировать по возрасту.
                3.Вернуться в меню.""";
        System.out.println(sorting);
        int sortScannerInt = scannerForStudentsInfo.nextInt();
        switch (sortScannerInt){
        case 1 -> {
            System.out.println();
            sortByName();
            toContinue();
        }case 2 -> {
             System.out.println();
             sortByAge();
             toContinue();
        }case 3 -> {
            String backToMenu = "Возврат в меню";
                System.out.println(backToMenu);
                mainMenu();
            }default -> {
            String failure = "Ошибка ввода. Попробуйте ещё раз.";
                System.err.println(failure);
                studentsInfo();
            }
        }
    }


    public void studentsShortcutInfo(){
        for (Student students : studentList){
            String info = students.getStudentId() + ", " + students.getStudentName() + ", " + students.getStudentAge() + ", "
                    + students.getStudentFaculty() + ", " + students.getStudentCourse();
            System.out.println(info);
        }
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
                mainMenu();
            }
            case 2 -> {
                System.out.println();
                exit();
                //Метод, который направлен на уточнение у пользователя о желании продолжать работать.
                //Ввод команд через консоль.
            }
        }
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public static Comparator<Student> CompareByAge = new Comparator<Student> (){
        public int compare(Student o1, Student o2){
        return o1.getStudentAge() - o2.getStudentAge();
        }
    };

    public void sortByAge(){
        studentList.sort(Student.CompareByAge);
        for (Student student : studentList){
            student.info();
        }
    }

    public static Comparator<Student> CompareByName = new Comparator<Student>() {
        public int compare(Student o1, Student o2){
            return o1.getStudentName().compareTo(o2.getStudentName());
        }
    };

    public void sortByName(){
        studentList.sort(Student.CompareByName);
        for (Student student : studentList){
            student.info();
        }
    }
}
