package by.tmstasks.exceptions.logincheck;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogInCheck {

    public static void loginCheck(String login) throws WrongLoginException {
        int count = 0;
        StringBuilder failure = new StringBuilder("Логин не соответствует установленным правилам:\n").append(
                "разрешается использование латиницы, цифр и знака подчёркивания, длинная логина не более 20 символов");

        Pattern loginPattern = Pattern.compile("\\w+");
        Matcher loginMatcher = loginPattern.matcher(login);     //Проверка правильности указания логина.

        Pattern valueCheck = Pattern.compile("\\w");
        Matcher valueMatcher = valueCheck.matcher(login);      //Для проверки количества символов.

        while (valueMatcher.find()){
            count++;                                            //Подсчёт символов.
        }


        if (!loginMatcher.matches()) {                                  //Вывод исключения, в случае отклонений от правил.
            throw new WrongLoginException(String.valueOf(failure));
        }

        if (count >= 20){                                                //Вывод исключения, если логин более 20 символов.
            throw new WrongLoginException(String.valueOf(failure));

        }

        }
    }
