package by.TMSTasks.lesson9_InputAndOutput.Task2_TextFormater;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormater {
    public static void wordFinder(String inputLine) {
        String line = " ";
        String output = "C:\\JavaCoreTMS\\src\\by\\TMSTasks\\lesson9_InputAndOutput\\Task2_TextFormater\\formatedText.txt";
        int wordCount = 0;



        try (BufferedReader reader = new BufferedReader(new FileReader(inputLine))) {

            while ((line = reader.readLine()) != null) {
                System.out.println(line);

                Pattern wordPattern = Pattern.compile("[a-zA-Z]+");     //Regex для поиска слов.
                Matcher wordMatcher = wordPattern.matcher(line);

                BufferedWriter writer = new BufferedWriter(new FileWriter(output, true));

                while (wordMatcher.find()) {     //Поиск слов.
                    wordCount++;    //Счётчик найденных слов.
                    /*System.out.print(wordMatcher.group() + " ");  */  //Вывод найденных слов.
                }
                if (wordCount >= 3 && wordCount <= 5) {
                    writer.write(line + "\n");  //Запись в файл formatedText.txt предложений, где от 3 до 5 слов
                }

                StringBuilder result = new StringBuilder("Количество слов в строке: ").append(wordCount).append("\n");

                System.out.println(result); //Вывод колчества слов в строке.
                wordCount = 0; //Обнуление счётчика слов.
                writer.close();         //Закрытие потока

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void palindromesFinder(String inputLine) throws FileNotFoundException {
        String output = "C:\\JavaCoreTMS\\src\\by\\TMSTasks\\lesson9_InputAndOutput\\Task2_TextFormater\\formatedText.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputLine));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output,true))) {
            String line;


            while ((line = reader.readLine()) != null) {        //Поиск слов в файле Text.txt

                Pattern wordPattern = Pattern.compile("[a-zA-Z]+");     //Regex для поиска слов.
                Matcher wordMatcher = wordPattern.matcher(line);

                Pattern charPattern = Pattern.compile("\\w");           //Regex для исключение букв.
                Matcher charMatcher = charPattern.matcher(line);
                //При риверсе буквы получается та же самая буква, программа распознаёт эту букву, как палиндром.

                while (wordMatcher.find()) {
                    StringBuilder reversedword = new StringBuilder(wordMatcher.group());

                    reversedword.reverse();         //Поиск палиндромов.

                    if (wordMatcher.group().equals(reversedword.toString())) {

                        writer.write(wordMatcher.group() + "\n");

                    }
                }
            }
            } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
