package by.TMSTasks.StreamAPI.Map.TMS;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PeopleApp {
    public static void main(String[] args) {
        Hobby hobby1 = new Hobby("IT", new Random().nextInt(11));
        Hobby hobby2 = new Hobby("Movie", new Random().nextInt(11));
        Hobby hobby3 = new Hobby("Squash", new Random().nextInt(11));

        People people1 = new People("Daniil", 22, Gender.MALE, List.of(hobby1, hobby2));
        People people2 = new People("Klim", 18, Gender.MALE, List.of(hobby1));
        People people3 = new People("Victor", 35, Gender.MALE, List.of(hobby1, hobby3));
        People people4 = new People("Artyom", 23, Gender.MALE, List.of(hobby3, hobby2));
        People people5 = new People("Nastia", 20, Gender.FEMALE, List.of(hobby1, hobby2, hobby3));

        List<People> peoples = List.of(people1, people2, people3, people4, people5);

        System.out.printf("The highest marks resul is - %s" ,peoples.stream().max(Comparator.comparing(people -> people.getHobbies()
                .stream().mapToInt(Hobby::getMark).sum(),Integer::compareTo)).orElse(new People()));        //Task 1

        System.out.printf("\nThe lowest marks resul is - %s" ,peoples.stream().min(Comparator.comparing(people -> people.getHobbies()
                .stream().mapToInt(Hobby::getMark).sum(),Integer::compareTo)).orElse(new People()));        //Task 2

    }
}
