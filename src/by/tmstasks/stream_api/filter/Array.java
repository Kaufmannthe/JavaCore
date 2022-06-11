package by.tmstasks.stream_api.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Array  {
    public static void main(String[] args) {

        String[] array = {"Dark", "Souls", "BloodBorne", "Dark"};

        List<String> stringList = Arrays.asList(array);

        stringList.forEach(System.out::println);

        long count = stringList.stream().filter(a -> a.equals("Dark")).count();
        String task1 = "1. Количество сходств: " + count;            //Task 1
        System.out.println(task1);

        Optional<String> firstElement = Optional.of(stringList.stream().findFirst().stream().findAny().orElse("0"));
        String task2 = "2. Первый элемент массива: " + firstElement;    //Task 2
        System.out.println(task2);


        String lastElement = stringList.stream().skip(stringList.size() - 1).findAny().orElse("Empty");
        String task3 ="3. Последний элемент массива:" + lastElement;    //Task 3
        System.out.println(task3);

        String equalElement = stringList.stream().filter("BloodBorne"::equals).findAny().orElse("Empty");
        String task4 = "4. 3й элемент массива:" + equalElement; //Task 4
        System.out.println(task4);

        List<String> twoElements = stringList.stream().skip(0).limit(2).toList();
        String task5 = "5. Два элемента массива: " + twoElements;    //Task 5
        System.out.println(task5);

        List<String> pattern = stringList.stream().filter(s -> s.contains("Dark")).toList();
        String task6 = "6. Шаблон поиска по слову Dark: " + pattern;        //Task 6
        System.out.println(task6);


    }
}
