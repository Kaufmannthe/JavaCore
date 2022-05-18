package by.TMSTasks.InputAndOutput.Task3_BlackList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class BlacklistMethod {
    private int count;

    public BlacklistMethod() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int blackListCheck(String string, String stringLine) throws IOException {
        String input = "C:\\JavaCoreTMS\\src\\by\\TMSTasks\\lesson9_InputAndOutput\\Task3_BlackList\\blacklist.txt";
        String blackLine;

        try (BufferedReader reader = new BufferedReader(new FileReader(input))) {

            while ((blackLine = reader.readLine()) != null) {
                if (Objects.equals(string, blackLine)) {
                    setCount(-1);
                    StringBuilder failure = new StringBuilder("Найдено запрещённое слово: ").append(blackLine)
                            .append(". \nВ строке: ").append(stringLine);
                    throw new BlackListExceptions(String.valueOf(failure));
                }
            }
        } catch (BlackListExceptions e) {
            System.err.println(e.getMessage());

        }
        return getCount();
    }
}

