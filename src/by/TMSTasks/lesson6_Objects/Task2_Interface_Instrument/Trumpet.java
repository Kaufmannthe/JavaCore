package by.TMSTasks.lesson6_Objects.Task2_Interface_Instrument;

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
