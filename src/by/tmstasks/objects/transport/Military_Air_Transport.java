package by.tmstasks.objects.transport;

public class Military_Air_Transport extends Air_Transport{
    private boolean catapultSystem;
    private int rocketValue;

    public Military_Air_Transport(int enginePower, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway, boolean catapultSystem, int rocketValue) {
        super(enginePower, maxSpeed, weight, brand, wingspan, minimumRunway);
        this.catapultSystem = catapultSystem;
        this.rocketValue = rocketValue;
    }

    public boolean isCatapultSystem() {
        return catapultSystem;
    }

    public void setCatapultSystem(boolean catapultSystem) {
        this.catapultSystem = catapultSystem;
    }

    public int getRocketValue() {
        return rocketValue;
    }

    public void setRocketValue(int rocketValue) {
        this.rocketValue = rocketValue;
    }

    public void transportInfo(){
        System.out.println("Мощность легковой машины: " + getEnginePower() + "л/c, максимальная скорость: " + getMaxSpeed() + "км/ч, " +
                "масса машины: " + getWeight() + "тонн, марка машины" + getBrand() + ", размах крыльев" + getWingspan() +
                ", минимальная длина взлётно-посадочной полосы для взлёта: " + getMinimumRunway() +
                ", наличие катапультирующей системы: " + isCatapultSystem() + ", количество ракет на борту: " + getRocketValue()
                + "мощность воздушного средства в килловатах: " + getEnginePower()*0.74 + "кВ");
    }
    public void rocketValueCheck(){
        if (rocketValue > 0){
            System.out.println("Ракета пошла!");
        }else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }
    public void catapultSystemCheck(){
        if (catapultSystem){
            System.out.println("Катапультирование прошло успешно.");
        }else {
            System.out.println("У вас нет системы катапультирования.");
        }
    }
}
