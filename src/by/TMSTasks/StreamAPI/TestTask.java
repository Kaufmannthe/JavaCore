package by.TMSTasks.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestTask {
    public static void main(String[] args) {
        List<Integer> stringStream = Arrays.asList(92,91,50,24,15,124,62,10,6,2,5,6,32,15);


        List<Integer> result = stringStream.stream().filter(s-> s % 2 == 0).collect(Collectors.toList());
        System.out.println(result);


    }
}
