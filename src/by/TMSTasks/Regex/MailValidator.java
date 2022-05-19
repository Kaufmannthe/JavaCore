package by.TMSTasks.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailValidator {
    public static void main(String[] args) {
        String input = "https://music-yandex.ru";
        String regexFirst = "((https:(\\/{2})))(www\\.)(.+\\.)(ru|org|net|com|)|(www\\.)(.+\\.)(ru|org|net|com)|(.+\\.)(ru|org|net|com)";

        Pattern pattern = Pattern.compile(regexFirst);
        Matcher matcher = pattern.matcher(input);

        System.out.println(matcher.find());

    }
}
