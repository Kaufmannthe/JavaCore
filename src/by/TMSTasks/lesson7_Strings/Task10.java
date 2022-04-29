package by.TMSTasks.lesson7_Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[] args) {
        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        String regex = "Java\\s+\\d";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
