package by.TMSTasks.Objects.Task2_Person;

public class Person {
    private String fullName;
    private int age;

    void move(){
        System.out.println(fullName + " идёт.");
    }
    void talk(){
        System.out.println(fullName + " говорит");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
    Person artyom = new Person("Artyom",23);
    Person darya = new Person();
    }
}
