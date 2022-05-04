package by.TMSTasks.lesson9_InputAndOutput.Task3_BlackList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainReader {
    public static void main(String[] args) throws IOException {
        String textInput = "C:\\JavaCoreTMS\\src\\by\\TMSTasks\\lesson9_InputAndOutput\\Task3_BlackList\\text.txt";
        String line;


        try (BufferedReader reader = new BufferedReader(new FileReader(textInput))) {
            BlacklistMethod blacklist = new BlacklistMethod();
            while ((line = reader.readLine()) != null) {

                Pattern wordPattern = Pattern.compile("\\S+");
                Matcher wordMatcher = wordPattern.matcher(line);


                while (wordMatcher.find()) {
                    blacklist.blackListCheck(wordMatcher.group(), line);
                }
            }
            test(blacklist);
        }
    }
    public static void test(BlacklistMethod blacklistMethod){
        if (blacklistMethod.getCount() == 0){
            StringBuilder success = new StringBuilder("Проверка пройдена успешно.");
            System.out.println(success);
        }
    }
}
