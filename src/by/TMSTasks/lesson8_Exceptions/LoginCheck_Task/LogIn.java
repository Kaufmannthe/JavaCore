package by.TMSTasks.lesson8_Exceptions.LoginCheck_Task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogIn {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordConfirmationException, WrongPasswordException {
        accountEnter("Kaufmannthe_1", "Artyom", "ArtyomЫ");


    }


    public static void accountEnter(String login, String password, String confirmPassword) {
        try {
            LogInCheck.loginCheck(login);
            PasswordCheck.passwordCheck(password, confirmPassword);
        } catch (WrongPasswordConfirmationException | WrongPasswordException | WrongLoginException e) {
            System.err.println(e.getMessage());
        }
    }
}
