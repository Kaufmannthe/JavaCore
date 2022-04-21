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

    public void carStart() throws CarException {
        Random r = new Random();
        int randomNumber = r.nextInt(0,21);
        StringBuilder failure = new StringBuilder("Ошибка запуска двигателя машины ");
        failure.append(this.carBrand);
        failure.append("\nПричина: четное число ");
        failure.append(randomNumber);

        StringBuilder success = new StringBuilder("Двигатель машины марки " + this.carBrand + " запущен, максимальная скорость машины: "
                +this.carSpeed + ", стоимость машины: " + this.carPrice + "(" + randomNumber + ")");

        if (randomNumber % 2 != 0){
            System.out.println(success);
        }else {
            throw new CarException(String.valueOf(failure));
        }

    }
}


