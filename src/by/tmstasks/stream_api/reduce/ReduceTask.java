package by.tmstasks.stream_api.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceTask {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,2);

        int task1 = integerList.stream().reduce(Integer::sum).get();
        String task1Result = "Сумма всех чисел массива: " + task1;      //Task 1
        System.out.println(task1Result);

        int task2 = integerList.stream().reduce(Integer::max).orElse(-1);   //Task 2
        String task2Result = "Наибольшее число в массиве: " + task2;
        System.out.println(task2Result);

        int task3 = integerList.stream().filter(s -> (s % 2) == 1).reduce(Integer::sum).get(); //Task 3
        String task3Result = "Сумма всех нечётных чисел: " + task3;
        System.out.println(task3Result);
    }
}
