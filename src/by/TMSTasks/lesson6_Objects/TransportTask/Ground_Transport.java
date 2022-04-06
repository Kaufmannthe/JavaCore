package by.TMSTasks.lesson6_Objects.TransportTask;

public abstract class Ground_Transport extends Transport{
    private int wheels;
    private int fuelConsumption;

    public Ground_Transport(int enginePower, int maxSpeed, int weight, String brand, int wheels, int fuelConsumption) {
        super(enginePower, maxSpeed, weight, brand);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void transportInfo(){

    }
}
