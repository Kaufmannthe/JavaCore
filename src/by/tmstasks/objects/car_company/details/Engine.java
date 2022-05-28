package by.tmstasks.objects.car_company.details;

public class Engine {
    private int enginePower;
    private String engineBrand;

    public int getEnginePower() {
        return enginePower;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public Engine(int enginePower, String engineBrand) {
        this.enginePower = enginePower;
        this.engineBrand = engineBrand;
    }
}
