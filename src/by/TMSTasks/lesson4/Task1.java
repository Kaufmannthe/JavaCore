package by.TMSTasks.lesson4;

public class Task1 {
    public static void main(String[] args) {
        int distance = 10;
        int days = 6;
        int count = 10;
        for(int i = 0; i <= days; i++){
            distance = distance + distance/10;
            count = count + distance;
            distance = Math.round(distance);
    }
        System.out.println(count + " киллометров пробежит спортсмен");
    }
}