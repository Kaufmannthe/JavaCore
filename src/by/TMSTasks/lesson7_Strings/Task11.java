package by.TMSTasks.lesson7_Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    public static void main(String[] args) {
        String text = "fffff ab f 1234 jkjk fffff";
        String regex = "^\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.print(matcher.group());
        }
    }
}
