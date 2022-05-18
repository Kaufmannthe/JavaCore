package by.TMSTasks.StreamAPI.Filter.People;

import java.util.Arrays;
import java.util.List;

public class PeopleApp {
    public static void main(String[] args) {
        List<People> peopleStream = Arrays.asList(new People("Артём",23, Sex.MALE),
                new People("Павел",21,Sex.MALE),new People("Дарья",18,Sex.WOMAN),
                new People("Евгений",21,Sex.MALE),new People("Святослав",29,Sex.MALE),
                new People("Екатерина",30,Sex.WOMAN),new People("Александр",30,Sex.MALE));
        String list = "Список людей:";
        System.out.println(list);
        peopleStream.forEach(System.out::println);

        String military = "Список военнообязанных: ";
        System.out.println("\n" + military);

        peopleStream.stream()
                .filter(m -> m.getSex() == Sex.MALE && m.getAge() >= 18 && m.getAge() < 27)
                .forEach(m -> System.out.println(m));       //Task 1


        double averageAge = peopleStream.stream().filter(p -> p.getSex() == Sex.MALE).mapToInt(People::getAge).average().getAsDouble();
        String result = "\nСредний возраст всех мужчин: " + averageAge;
        System.out.println(result);


        long workableMales = peopleStream.stream().filter(m -> m.getSex() == Sex.MALE && m.getAge() >= 18 && m.getAge() < 60).count();
        long workableWomen = peopleStream.stream().filter(w -> w.getSex() == Sex.WOMAN && w.getAge() >= 18 && w.getAge() < 55).count();
        long workable = workableMales + workableWomen;
        String workableResult = "\nОбщее количество работоспособных людей: " + workable + ".\nИз них: мужчин " +workableMales +
        ", женщин " + workableWomen;
        System.out.println(workableResult);

        long test = peopleStream.stream().filter(p -> p.getSex() == Sex.MALE && p.getAge() < 60
                || p.getSex() == Sex.WOMAN && p.getAge() < 55).count();
        String testResult = "\nКоличество работоспособных людей: " + test;
        System.out.println(testResult);

    }
}
