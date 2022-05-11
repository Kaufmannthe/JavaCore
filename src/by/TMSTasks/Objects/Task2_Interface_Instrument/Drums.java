package by.TMSTasks.Objects.Task2_Interface_Instrument;

public class Drums implements Instrument{
    private int drumsSize;

    public Drums(int drumsSize) {
        this.drumsSize = drumsSize;
    }

    public int getDrumsSize() {
        return drumsSize;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан," + getDrumsSize() + " см.");
    }
}
