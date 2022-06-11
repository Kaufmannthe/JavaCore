package by.tmstasks.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(test("google.com"));
        System.out.println(test("www.reference1.ua"));
        System.out.println(test("www.reference1.org"));
    }

    public static boolean test(String testString) {
        Pattern pattern = Pattern.compile("w+\\.+.+\\.(com|ua|ru|org)");
        Matcher matcher = pattern.matcher(testString);
        return ((Matcher) matcher).matches();
    }
}
