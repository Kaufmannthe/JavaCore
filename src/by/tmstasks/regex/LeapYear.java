package by.tmstasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeapYear {
    public static void main(String[] args) {

        String regex = "^(?:(?:[1-9]\\d)(?:0[48]|[2468][048]|[13579][26])|(?:(?:[2468][048]|[13579][26])00))$";
        String input = "2020";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        String result = "Is it " + input + " is a leap year? " + matcher.find();

        System.out.println(result);

    }
}