package by.TMSTasks.InputAndOutput.Task1_Palindromes;

import java.io.*;

/*
В исходном файле находятся слова, каждое слово на новой стороке. После
        запуска программы должен создать файл, который будет содержать в себе
        только полиндромы
*/

public class FileInputClass {
    public static void main(String[] args) throws IOException {
        String input = "C:\\JavaCoreTMS\\src\\by\\TMSTasks\\lesson9_InputAndOutput\\Task1_Palindromes\\Text.txt";
        String output = "C:\\JavaCoreTMS\\src\\by\\TMSTasks\\lesson9_InputAndOutput\\Task1_Palindromes\\replacedText.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader((input))); //Указание файла, с которого считывается текст.
             BufferedWriter writer = new BufferedWriter(new FileWriter(output, false))){
            //Указание директории, в которой необходимо создать файл и указать слова палиндромы.

            String line;

            while ((line = reader.readLine()) != null) {        //Поиск слов в файле Text.txt
                StringBuilder reversedLine = new StringBuilder(line);    //Создание SB для риверса строки line.txt.
                reversedLine.reverse();                                 //Переворачиваем проверяемую строку.
                if (line.equals(reversedLine.toString())) {

                    //Если перевернётая строка == обычной строке, то создаётся файл replacedText и туда вносятся похожие слова.

                    System.out.println(line);             //Проверка вывода.

                        writer.write(line + "\n"); //Запись палиндромов на файл replacedText.txt
                }
            }
        }
    }
}
