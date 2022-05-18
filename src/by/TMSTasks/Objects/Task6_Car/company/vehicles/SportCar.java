package by.TMSTasks.Objects.Task6_Car.company.vehicles;

public class SportCar extends Car{
    int maxSpeed;

    public SportCar(String carBrand, String carClass, int carWeight, int maxSpeed) {
        super(carBrand, carClass, carWeight);
        this.maxSpeed = maxSpeed;
    }
}
