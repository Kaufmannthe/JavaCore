package by.TMSTasks.StreamAPI.Task3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class OrderedUnorderedList {
    public static void main(String[] args) {
        Collection ordered = Arrays.asList("a2", "a3", "a2", "a3", "a1", "a2", "a2");
        Collection nonOrdered = new HashSet<>(ordered);

        List<String> nonOrderedList = nonOrdered.stream().distinct().toList();     //Task 1
        String nonOrderedResult = "Упорядоченный стрим после метода distinct: " + nonOrderedList;
        System.out.println(nonOrderedResult);

        List<String> orderedList = ordered.stream().distinct().toList();        //Task 2
        String orderedResult = "Неупорядоченный стрим после метода distinct: " + orderedList;
        System.out.println(orderedResult);

        //distinct - исключает из коллекции все дубли элементов.

    }
}
