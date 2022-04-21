package by.TMSTasks.lesson8_Exceptions;

import java.util.Random;

public class Car {
    private String carBrand;
    private int carSpeed;
    private double carPrice;

    public Car() {
    }

    public Car(String carBrand, int carSpeed, double carPrice) {
        this.carBrand = carBrand;
        this.carSpeed = carSpeed;
        this.carPrice = carPrice;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public static void carStart(Car car) throws Car_Exception {
        Random r = new Random();
        int randomNumber = r.nextInt(0,21);
        if (randomNumber % 2 != 0){
            System.out.println("Двигатель машины марки " + car.getCarBrand() + " запущен, максимальная скорость машины: "
                    +car.getCarSpeed() + ", стоимость машины: " + car.carPrice + "(" + randomNumber + ")");
        }else {
            throw new Car_Exception("Ошибка запуска двигателя машины " + car.carBrand + "\nПричина: " +
                    "четное число " + randomNumber);
        }

    }
}


