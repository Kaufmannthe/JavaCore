package by.TMSTasks.StreamAPI.MaxMin;

import by.TMSTasks.StreamAPI.Sorted.People;
import by.TMSTasks.StreamAPI.Sorted.Sex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinTask {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a1", "a2", "a3", "a1");
        List<People> peopleStream = Arrays.asList(
                new People("Артём",23, Sex.MALE),
                new People("Павел",21,Sex.MALE),
                new People("Дарья",18,Sex.WOMAN),
                new People("Евгений",21,Sex.MALE),
                new People("Святослав",29,Sex.MALE),
                new People("Екатерина",30,Sex.WOMAN),
                new People("Александр",30,Sex.MALE));

       String task1 = stringList.stream().max(String::compareTo).get();
       String task1Result = "Максимальный элемент массива строк: " + task1;     //Task 1
        System.out.println(task1Result);

       String task2 = stringList.stream().min(String::compareTo).get();         //Task 2
        String task2Result = "Наименьший элемент массива строк: " + task2;
        System.out.println(task2Result);

        People task3 = peopleStream.stream().max(Comparator.comparingInt(People::getAge)).get();
        String task3Result = "Самый старший человек из массива: " + task3;      //Task 3
        System.out.println(task3Result);

        People task4 =peopleStream.stream().min(Comparator.comparingInt(People::getAge)).get();
        String task4Result = "Самый младший человек из массива: " + task4;
        System.out.println(task4Result);
    }
}
