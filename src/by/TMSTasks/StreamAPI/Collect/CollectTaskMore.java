package by.TMSTasks.StreamAPI.Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectTaskMore {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a1", "b2", "c3", "a1");

        List<String> task1 = stringList.stream().distinct().collect(Collectors.toList());
        String task1Result = "Массив без дубликатов: " + task1;         //Task 1
        System.out.println(task1Result);

        List<String> task2 = stringList.stream().distinct().map(String::toUpperCase).collect(Collectors.toList());
        String task2Result = "Массив без дубликатов в верхнем регистре: " + task2;      //Task 2
        System.out.println(task2Result);

        String task3 = stringList.stream().collect(Collectors.joining(":","<b>","</b>"));
        String task3Result = "Перевод массива в одну строку и добавления разделителя, префикса и суффикса: " + task3;
        System.out.println(task3Result);

        Map<Object,Object> task4 = stringList.stream().distinct().collect(Collectors.toMap((p) -> p.substring(0,1),(p)-> p.substring(1,2)));
        String task4Result = "Первый символ ключ, элементы разделены: " + task4;
        System.out.println(task4Result);

        Map<Object,String> task5 = stringList.stream().collect(Collectors.groupingBy(p -> p.substring(0,1),
                Collectors.mapping(p -> p.substring(0,2),Collectors.joining(":"))));
        String task5Result = "Сгруппированы по первому символу строки: " + task5;       //Task 5
        System.out.println(task5Result);

        //joining - добавляет разделитель, префикс и суффикс к элементам массива.
    }
}
