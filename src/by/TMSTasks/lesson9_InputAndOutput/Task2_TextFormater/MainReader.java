package by.TMSTasks.lesson9_InputAndOutput.Task2_TextFormater;


import java.io.IOException;

public class MainReader {
    public static void main(String[] args) throws IOException {
        String inputFile = "C:\\JavaCoreTMS\\src\\by\\TMSTasks\\lesson9_InputAndOutput\\Task2_TextFormater\\text.txt";

        TextFormater.wordFinder(inputFile);

        TextFormater.palindromesFinder(inputFile);




    }
}
