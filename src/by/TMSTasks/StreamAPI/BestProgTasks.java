package by.TMSTasks.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class BestProgTasks {
    public static void main(String[] args) {
        List<Integer> stringStream = Arrays.asList(92,91,50,24,15,124,62,10,6,2,5,6,32,15);

        List<Integer> task1 = stringStream.stream().filter(s -> s % 2 == 0).toList();
        String task1Result = "Определение количества четных чисел в потоке данных: " + task1;
        System.out.println(task1Result);            //Task 1
        //__________________________________________________
        List<String> stringList = Arrays.asList("James","John","Amy","Natan");

        List<String> task2 = stringList.stream().filter(s -> s.charAt(0) == 'J').toList();
        String task2Result = "Поиск в строке слов, которые начинаются на J: " + task2;
        System.out.println(task2Result);            //Task 2
        //__________________________________________________
        String[] stringTask3 = {"abcd", "bcfk", "def", "jklmn", "jprst",
                "afc", "ambn", "kmk", "rbd", "jus"};

        List<String> arrayTask3 = Arrays.asList(stringTask3);

        List<String> finalArray = arrayTask3.stream().sorted(String::compareTo).toList();
        String task3Result = "Сортировка строки в лексикографическом порядке: " + finalArray;
        System.out.println(task3Result);            //Task 3
        //__________________________________________________





    }
}
