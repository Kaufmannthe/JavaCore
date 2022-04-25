package by.TMSTasks.lesson8_Exceptions.LoginCheck_Task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {
    public static void passwordCheck(String password, String confirmPassword) throws WrongPasswordException,
            WrongPasswordConfirmationException {

        int count = 0;
        StringBuilder failure = new StringBuilder("Пароль не соответствует установленным правилам\n").append(
                "разрешается использование латиницы, цифр и знака подчёркивания, длинная пароля не более 20 символов");
        StringBuilder failureConfirmation = new StringBuilder("Ошибка подтверждения пароля.");

        Pattern passwordPattern = Pattern.compile("\\w+");
        Matcher passwordMatcher = passwordPattern.matcher(password);     //Проверка правильности указания логина.

        Pattern valueCheck = Pattern.compile("\\w");
        Matcher valueMatcher = valueCheck.matcher(password);      //Для проверки количества символов.

        while (valueMatcher.find()){
            count++;                                            //Подсчёт символов.
        }

        if (!password.equals(confirmPassword) && passwordMatcher.matches()){
            throw new WrongPasswordConfirmationException(String.valueOf(failureConfirmation));      //Вывод исключения, в случае неправильного подтверждения.
        }

        if (!passwordMatcher.matches()) {                                  //Вывод исключения, в случае отклонений от правил.
            throw new WrongPasswordException(String.valueOf(failure));
        }

        if (count >= 20){                                                //Вывод исключения, если логин более 20 символов.
            throw new WrongPasswordException(String.valueOf(failure));
        }

    }
}
