package by.tmstasks.objects.interface_instrument;

public class Trumpet implements Instrument{
    private int trumpetDiameter;

    public Trumpet(int trumpetDiameter) {
        this.trumpetDiameter = trumpetDiameter;
    }

    public int getTrumpetDiameter() {
        return trumpetDiameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром в " + getTrumpetDiameter() + " см.");
    }
}
