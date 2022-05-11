package by.TMSTasks.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task12 {
    public static void main(String[] args) {
        String text = "One two three раз два три one1 two2 123";
        String regex = "[a-zA-Z]\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int count = 0;


        while (matcher.find()) {
                count++;
            }
        StringBuilder result = new StringBuilder("Количество слов в тексе на латинице: ").append(count);
        System.out.println(result);
        }
    }
