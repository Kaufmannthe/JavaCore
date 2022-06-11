package by.tmstasks.objects.car_company;

import by.tmstasks.objects.car_company.vehicles.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car("BMW","Бизнес класс",2);

        car.printInfo();
    }
}
