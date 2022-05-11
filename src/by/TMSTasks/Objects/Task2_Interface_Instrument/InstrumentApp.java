package by.TMSTasks.Objects.Task2_Interface_Instrument;

public class InstrumentApp {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar(8);
        Drums drums1 = new Drums(60);
        Trumpet trumpet1 = new Trumpet(30);


        Instrument[] instruments = {guitar1,drums1,trumpet1};

        for(Instrument instrument : instruments){
            instrument.play();
        }
    }
}
