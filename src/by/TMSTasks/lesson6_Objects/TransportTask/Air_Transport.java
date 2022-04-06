package by.TMSTasks.lesson6_Objects.TransportTask;

public abstract class Air_Transport extends Transport{
    private int wingspan;
    private int minimumRunway;

    public Air_Transport(int enginePower, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway) {
        super(enginePower, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minimumRunway = minimumRunway;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinimumRunway() {
        return minimumRunway;
    }

    public void setMinimumRunway(int minimumRunway) {
        this.minimumRunway = minimumRunway;
    }
}
