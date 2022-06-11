package by.tmstasks.objects.car_company.vehicles;

public class Lorry extends Car{
    private int loadCapacity;

    public Lorry(String carBrand, String carClass, int carWeight, int loadCapacity) {
        super(carBrand, carClass, carWeight);
        this.loadCapacity = loadCapacity;
    }
}
