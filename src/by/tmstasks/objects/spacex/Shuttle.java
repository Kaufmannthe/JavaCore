package by.tmstasks.objects.spacex;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean checkSystem() {
        Random r = new Random();
        int checkNumber = r.nextInt(0, 11);
        if (checkNumber > 3) {
            System.out.println("Предстартовая проверка прошла успешно с числом " + checkNumber);
            return true;
        } else {
            System.out.println("Предстартовая проверка провалена с числом " + checkNumber);
        }return false;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели запущены.");
    }

    @Override
    public void start() {
        System.out.println("Шатл запущен.");
    }
}

