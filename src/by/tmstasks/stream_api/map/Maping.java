package by.tmstasks.stream_api.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Maping {
    public static void main(String[] args) {
        List<String> firstArray = Arrays.asList("a1", "a2", "a3","a1","a5","a2");
        List<String> secondArray = Arrays.asList("1,2,0", "4,5");

        firstArray.forEach(System.out::print);
        System.out.println();
        secondArray.forEach(System.out::print);
        System.out.println();

        List<String> task1 = firstArray.stream().map(s -> s +"_1").collect(Collectors.toList());    //Task 1
        String task1Result = "Элементы коллекци после добавления _1: " + task1;
        System.out.println(task1Result);

        int[] task2 = firstArray.stream().mapToInt(s -> Integer.parseInt(s.substring(1))).toArray();
        String task2Result = "Элементы массива после исключения всех букв: " + Arrays.toString(task2);  //Task 2
        System.out.println(task2Result);

        String[] task3 = secondArray.stream().flatMap(s -> Arrays.asList(s.split(",")).stream()).toArray(String[]::new);
        String task3Result = "Элементы второго массива разделённые: " + Arrays.toString(task3);     //Task 3
        System.out.println(task3Result);

        int task4 = secondArray.stream().flatMapToInt(s -> Arrays.asList(s.split(",")).stream().mapToInt(
                Integer::parseInt)).sum();                                                  //Task 4
        String task4Result = "Сумма всех чисел второго массива: " + task4;
        System.out.println(task4Result);

        //map - преобразует каждый элемент стрим.(То есть, внесение изменений в элементы массива)
        //mapToInt/mapToDouble/mapToLong - возвращает числовой стрим.
        //flatMap/flatMapToInt/flatMapToDouble/flatMapToLong - возвращает несколько объектов из одного.

    }
}
