package by.tmstasks.objects.interface_instrument;

public class Guitar implements Instrument{
    private int guitarStrings;

    public Guitar(int guitarStrings) {
        this.guitarStrings = guitarStrings;
    }

    public int getGuitarStrings() {
        return guitarStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет " + getGuitarStrings() + "-струнная гитара");
    }
}
