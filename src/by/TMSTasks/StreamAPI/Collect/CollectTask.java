package by.TMSTasks.StreamAPI.Collect;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectTask {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,2);

        int task1 = integerList.stream().collect(Collectors.summingInt((p)-> p % 2 == 1 ? p:0));
        String task1Result = "Сумма нечётных чисел массива: " + task1;      //Task 1
        System.out.println(task1Result);

        double task2 = integerList.stream().collect(Collectors.averagingInt((p) -> p - 1 ));
        String task2Result = "Среднее арифметическое чисел массива с вычетом 1 из каждого числа: " + task2;
        System.out.println(task2Result);            //Task 2

        IntSummaryStatistics task3 = integerList.stream().collect(Collectors.summarizingInt((p) -> p +3));
        String task3Result = "Прибавление к каждому элементу 3 и вывод статистики: " + task3;   //Task 3
        System.out.println(task3Result);

        Map<Boolean, List<Integer>> task4 = integerList.stream().collect(Collectors.partitioningBy(p -> p % 2 == 0));
        String task4Result = "Чётные - true, нечётные - false: " + task4;           //Task 4
        System.out.println(task4Result);


    }
}
