package by.TMSTasks.lesson4;

public class Task1 {
    public static void main(String[] args) {
        float distance = 10;
        int days = 7;
        for(int i = 0; i <= days; i++){
            distance = distance + (distance/10);
            distance = Math.round(distance);
    }
        System.out.println(distance + " киллометров пробежит спортсмен");
    }
}