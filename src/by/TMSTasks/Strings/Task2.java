package by.TMSTasks.Strings;

public class Task2 {
    public static void main(String[] args) {
        String string = new String("We are learning Java String's!");
        char replacedChar = string.charAt(3);
        char replacingChar = string.charAt(0);
        System.out.println(string);
        System.out.println("Replaced string: " + string.replace(replacedChar,replacingChar));
        System.out.println(string.charAt(3));
        System.out.println(string.charAt(0));

    }
}
