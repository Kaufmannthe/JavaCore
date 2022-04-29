package by.TMSTasks.lesson7_Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("с*a*b");
        Matcher matcher = pattern.matcher("сaaab");
        boolean b = ((Matcher) matcher).matches();
        System.out.println(b);
    }
}
