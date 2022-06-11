package by.tmstasks.stream_api.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SortedMain {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");
        List<People> peopleStream = Arrays.asList(new People("Артём",23, Sex.MALE),
                new People("Павел",21,Sex.MALE),new People("Дарья",18,Sex.WOMAN),
                new People("Евгений",21,Sex.MALE),new People("Святослав",29,Sex.MALE),
                new People("Екатерина",30,Sex.WOMAN),new People("Александр",30,Sex.MALE));

        List<String> task1 = stringList.stream().sorted().toList();
        String task1Result = "1. Отсортированный первый массив: " + task1;                 //Task 1
        System.out.println(task1Result);

        List<String> task2 = stringList.stream().sorted((o1, o2) -> -o1.compareTo(o2)).toList();
        String task2Result = "2. Массив в обратном порядке: " + task2;         //Task 2
        System.out.println(task2Result);

        List<String> task3 = stringList.stream().sorted(String::compareTo).distinct().toList();
        String task3Resul = "3. Массив без дублей: " + task3;
        System.out.println(task3Resul);

        List<String> task4 = stringList.stream().sorted(((o1, o2) -> -o1.compareTo(o2))).distinct().toList();
        String task4Result = "4. Массив в обратном порядке без дублей: " + task4;      //Task 4
        System.out.println(task4Result);


        List<People> task5 = peopleStream.stream().sorted((o1, o2) -> -o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
        System.out.println("5. Список людей, отсортированных в обратном порядке по имени: ");
        System.out.print(task5);                                                                    //Task 5
        System.out.println();

        List<People> task6 = peopleStream.stream().filter(s -> s.getSex() == Sex.MALE).sorted(
                (o1, o2) -> -o1.getName().compareTo(o2.getName())).toList();
        List<People> task6women = peopleStream.stream().filter(s -> s.getSex() == Sex.WOMAN).sorted(            //Task 6
                (o1, o2) -> -o1.getName().compareTo(o2.getName())).toList();
        ArrayList finalList = new ArrayList(Arrays.asList(task6,task6women));
        String task6Result = "Отсортированный список людей в обратном порядке мужчина - женщина: " + finalList;
        System.out.println(task6Result);

    }
}
