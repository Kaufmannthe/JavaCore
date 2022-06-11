package by.tmstasks.objects.car_company.professions;

public class Driver extends Person{
    private String driversName;
    private int driversExperience;


    public String getDriversName() {
        return driversName;
    }

    public int getDriversExperience() {
        return driversExperience;
    }

    public Driver(String driversName, int driversExperience,int age) {
        super(age);
        this.driversName = driversName;
        this.driversExperience = driversExperience;
    }
}
