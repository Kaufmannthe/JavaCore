package by.TMSTasks.lesson6_Objects.Task6_Car.company;

import by.TMSTasks.lesson6_Objects.Task6_Car.company.vehicles.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car("BMW","Бизнес класс",2);

        car.printInfo();
    }
}
