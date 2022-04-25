package by.TMSTasks.lesson9_InputAndOutput.Task1;

import java.io.*;

/*
В исходном файле находятся слова, каждое слово на новой стороке. После
        запуска программы должен создать файл, который будет содержать в себе
        только полиндромы
*/

public class FileInputClass {
    public static void main(String[] args) throws IOException {
        String input = "C:\\JavaCoreTMS\\src\\by\\TMSTasks\\lesson9_InputAndOutput\\Task1\\Text.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader((input)))) {
            String line;

            while ((line = reader.readLine()) != null) {
                StringBuilder reversedLine = new StringBuilder(line);
                reversedLine.reverse();
                if (line.equals(reversedLine.toString())) {
                    System.out.println(line);

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("" +
                            "C:\\JavaCoreTMS\\src\\by\\TMSTasks\\lesson9_InputAndOutput\\Task1\\replacedText.txt", true))) {
                        writer.write(line + "\n");


                    } catch (IOException e) {
                        e.printStackTrace();

                    }
                }
            }
        }
    }
}
