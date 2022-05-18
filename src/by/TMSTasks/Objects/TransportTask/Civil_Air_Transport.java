package by.TMSTasks.Objects.TransportTask;

public class Civil_Air_Transport extends Air_Transport{
    private int passengersValue;
    private boolean businessClass;

    public Civil_Air_Transport(int enginePower, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway, int passengersValue, boolean businessClass) {
        super(enginePower, maxSpeed, weight, brand, wingspan, minimumRunway);
        this.passengersValue = passengersValue;
        this.businessClass = businessClass;
    }

    public int getPassengersValue() {
        return passengersValue;
    }

    public void setPassengersValue(int passengersValue) {
        this.passengersValue = passengersValue;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void transportInfo(){
        System.out.println("Мощность легковой машины: " + getEnginePower() + "л/c, максимальная скорость: " + getMaxSpeed() + "км/ч, " +
                "масса машины: " + getWeight() + "тонн, марка машины" + getBrand() + ", размах крыльев" + getWingspan() +
                ", минимальная длина взлётно-посадочной полосы для взлёта: " + getMinimumRunway() +
                ", вместимость пассажиров: " + getPassengersValue() + ", наличие бизнес класса: " + isBusinessClass()
                + "мощность воздушного средства в килловатах: " + getEnginePower()*0.74 + "кВ");
    }

    public void passengerValueCheck(int value){
        if (value > passengersValue){
            System.out.println("Самолёт не сможет вместить " + value + " человек, т.к. количество человекомест: " + passengersValue);
        }else {
            System.out.println("Добро пожаловать на борт!");
        }
    }
}
