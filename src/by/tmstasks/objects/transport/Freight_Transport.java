package by.tmstasks.objects.transport;

public class Freight_Transport extends Ground_Transport{
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Freight_Transport(int enginePower, int maxSpeed, int weight, String brand, int wheels, int fuelConsumption, int loadCapacity) {
        super(enginePower, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void transportInfo(){
        System.out.println("Мощность легковой машины: " + getEnginePower() + " л/c, максимальная скорость: " + getMaxSpeed() + "км/ч, " +
                "масса машины: " + getWeight() + " т., марка машины: " + getBrand() + ", количество колёс: " + getWheels() +
                ", расход топлива: " + getFuelConsumption() + ", грузоподъёмность машины: " + getLoadCapacity() + " т.," + "мощность машины в килловатах: " +
                 getEnginePower()*0.74 + "кВ");
    }

    public void loadCapacityCheck(int weight){
        if (weight > loadCapacity){
            System.out.println("Вам необходим грузовик побольше.");
        }else {
            System.out.println("Грузовик загружен.");
        }
    }
}
