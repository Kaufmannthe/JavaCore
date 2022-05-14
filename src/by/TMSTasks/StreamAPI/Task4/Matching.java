package by.TMSTasks.StreamAPI.Task4;

import java.util.Arrays;
import java.util.List;

public class Matching {
    public static void main(String[] args) {
        List<String> array = Arrays.asList("a1", "a2", "a3", "a1");

        boolean task1 = array.stream().anyMatch("a1" :: equals);
        String task1Result = "Существует ли в коллекции элемент а1? Ответ: " + task1;       //Task 1
        System.out.println(task1Result);

        boolean task2 = array.stream().anyMatch("a8" :: equals);
        String task2Result = "Существует ли в коллекции элемент а8? Ответ: " + task2;       //Task 2
        System.out.println(task2Result);

        boolean task3 = array.stream().allMatch(s -> s.contains("1"));
        String task3Result = "У всех ли элементов коллекции имеется 1? Ответ: " + task3;    //Task 3
        System.out.println(task3Result);

        boolean task4 = array.stream().noneMatch("a7" :: equals);
        String task4Result = "В коллекции не содержится хотя бы один элемент 'a7'? Ответ: " + task4;    //Task 4
        System.out.println(task4Result);

        //anyMatch - находит хотя бы одно совпадение в коллекции.
        //allMatch - проверяет совпадает ли условие со всеми элементами таблицы.
        //noneMatch - проверяет, чтобы ни один из элементов коллекции не соответствовал условию.
    }
}
