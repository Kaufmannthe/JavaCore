package by.tmstasks.objects.spacex;

public class SpaceX_App {
    public static void main(String[] args) {
        Shuttle shuttle = new Shuttle();

        if (shuttle.checkSystem()){
            shuttle.engineStart();
            shuttle.start();
        }else {
            System.out.println("Двигатели не запущены. Отмена запуска.");
        }
        }
    }

