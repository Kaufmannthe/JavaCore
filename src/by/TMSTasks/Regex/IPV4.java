package by.TMSTasks.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPV4 {
    public static void main(String[] args) {
        String input = "255.255.255.16";
        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}.\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.find());
    }
}
