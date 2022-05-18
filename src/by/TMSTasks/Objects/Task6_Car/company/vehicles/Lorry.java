package by.TMSTasks.Objects.Task6_Car.company.vehicles;

public class Lorry extends Car{
    private int loadCapacity;

    public Lorry(String carBrand, String carClass, int carWeight, int loadCapacity) {
        super(carBrand, carClass, carWeight);
        this.loadCapacity = loadCapacity;
    }
}
