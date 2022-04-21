package by.TMSTasks.lesson7_Strings.Task3;

import java.util.Locale;

public class StringMethods {
    private String taskString;

    public String getTaskString() {
        return taskString;
    }

    public void setTaskString(String taskString) {
        this.taskString = taskString;
    }

    public StringMethods() {
    }

    public StringMethods(String taskString) {
        this.taskString = taskString;
    }

    public void stringTaker (){                      //Task 1
        System.out.println(this.taskString);
    }


    public void theLastChar(){                                                   //Task 2
        int stringLength = this.taskString.length();
        StringBuilder result = new StringBuilder("Последний символ: ");
        result.append(this.taskString.charAt(this.taskString.length() - 1));
        System.out.println(result);
    }


    public void theLastCharsChecking(){
        StringBuilder success = new StringBuilder("Данная строка заканчивается на !!!");
        StringBuilder failure = new StringBuilder("Ошибка. Данная строка не заканчивается на !!!");         //Task 3
        if (this.taskString.endsWith("!!!")){
            System.out.println(success);
        }else {
            System.out.println(failure);
        }

    }

    public void theFirstCharsChecking(){
        StringBuilder success = new StringBuilder("Данная строка начинается на I love.");
        StringBuilder failure = new StringBuilder("Ошибка. Данная строка не начинается на I love.");        //Task 4
        if (this.taskString.startsWith("I love")){
            System.out.println(success);
        }else {
            System.out.println(failure);
        }
    }
    public void theJavaWordChecking(){
        StringBuilder success = new StringBuilder("Данная строка содержит слово Java.");
        StringBuilder failure = new StringBuilder("Ошибка. Данная строка не содержит слово Java.");     //Task 5
        if (this.taskString.contains("Java")){
            System.out.println(success);
        }else {
            System.out.println(failure);
        }
    }

    public void theJavaPositionFinder(){
        String startsJavaWord = new String(String.valueOf(this.taskString.indexOf("Java")));        //Task 6
        StringBuilder result = new StringBuilder("Позиция слова 'Java' в строке: ");
        result.append(startsJavaWord);

        System.out.println(result);
    }

    public void theReplacer(){
        StringBuilder replace = new StringBuilder(this.taskString.replace("a","o"));        //Task 7
        System.out.println(replace);
    }

    public void theUpperCase(){
        StringBuilder stringInUpperCase = new StringBuilder(this.taskString.toUpperCase(Locale.ROOT));      //Task 8
        System.out.println(stringInUpperCase);
    }

    public void theLowerCase(){
        StringBuilder stringInLowerCase = new StringBuilder(this.taskString.toLowerCase(Locale.ROOT));      //Task 9
        System.out.println(stringInLowerCase);
    }

    public void theSubstring(){
        int firstWord = this.taskString.indexOf("J");
        int lastWord = this.taskString.lastIndexOf("a");
        StringBuilder theSubstringJava = new StringBuilder(this.taskString.substring(firstWord,lastWord + 1));      //Task 10
        System.out.println(theSubstringJava);
    }


}
