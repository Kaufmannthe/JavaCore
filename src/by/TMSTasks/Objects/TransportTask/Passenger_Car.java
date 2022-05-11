package by.TMSTasks.Objects.TransportTask;

public class Passenger_Car extends Ground_Transport{
    private String carBody;
    private int passengersValue;

    public Passenger_Car(int enginePower, int maxSpeed, int weight, String brand, int wheels, int fuelConsumption, String carBody, int passengersValue) {
        super(enginePower, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.carBody = carBody;
        this.passengersValue = passengersValue;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public int getPassengersValue() {
        return passengersValue;
    }

    public void setPassengersValue(int passengersValue) {
        this.passengersValue = passengersValue;
    }

    public void transportInfo(){
        System.out.println("Мощность легковой машины: " + getEnginePower() + " л/c, максимальная скорость: " + getMaxSpeed() + " км/ч, " +
                "масса машины: " + getWeight() + " т., марка машины: " + getBrand() + ", количество колёс: " + getWheels() +
                ", расход топлива: " + getFuelConsumption() + ", кузов: " + getCarBody() + ", вместимость пассажиров: " + getPassengersValue()
                + ", мощность машины в килловатах: " + getEnginePower()*0.74 + "кВ");
    }
    public int fuelScore(double drivingTime){
        double flowCalculation =  (   (  (drivingTime/60)  *  getMaxSpeed()  ) / 100 ) * getFuelConsumption();
        System.out.println("Расход топлива за " + drivingTime + " минут на максимальной скорости: " + getMaxSpeed() +
                " км/ч, составляет " + flowCalculation + " л.");
        return (int) flowCalculation;
    }

}
