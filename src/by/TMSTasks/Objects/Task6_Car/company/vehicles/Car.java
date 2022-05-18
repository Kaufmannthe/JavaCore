package by.TMSTasks.Objects.Task6_Car.company.vehicles;

import by.TMSTasks.Objects.Task6_Car.company.details.Engine;
import by.TMSTasks.Objects.Task6_Car.company.professions.Driver;

public class Car {
    private String carBrand;
    private String carClass;
    private int carWeight;

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public Car(String carBrand, String carClass, int carWeight) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.carWeight = carWeight;
    }

    Driver driver = new Driver("Артём",10,23);
    Engine engine = new Engine(150,"Kyoto");



    public void start(){
        System.out.println("Стартуем! ");
    }

    public void stop(){
        System.out.println("Останавливаемся! ");
    }

    public void turnRight(){
        System.out.println("Поворот направо. ");
    }

    public void turnLeft(){
        System.out.println("Поворот налево. ");
    }

    public void printInfo(){
        System.out.println("Марка машины: " + getCarBrand() + ", класс машины: " + getCarClass()
        + ", вес машины: " + getCarWeight() + " т., мощность двигателя: " + engine.getEnginePower() +
                " л/c, производитель двигателя: " + engine.getEngineBrand() + ", водитель: "
                + driver.getDriversName() + " " +driver.getAge() + " года," + " c опытом вождения " + driver.getDriversExperience() + " лет.");
    }

}
