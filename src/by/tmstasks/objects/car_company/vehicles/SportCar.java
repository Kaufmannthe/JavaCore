package by.tmstasks.objects.car_company.vehicles;

public class SportCar extends Car{
    int maxSpeed;

    public SportCar(String carBrand, String carClass, int carWeight, int maxSpeed) {
        super(carBrand, carClass, carWeight);
        this.maxSpeed = maxSpeed;
    }
}
