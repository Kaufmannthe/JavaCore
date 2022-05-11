package by.TMSTasks.InputAndOutput.Task4_Serialization;

import java.io.Serial;
import java.io.Serializable;

public class Car implements Serializable {

    @Serial
    private static final long serialVersionUID = 17L;

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

}
