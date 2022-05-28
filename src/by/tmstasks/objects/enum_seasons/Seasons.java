package by.tmstasks.objects.enum_seasons;

public enum Seasons {
    WINTER("Зима",-10),
    SUMMER("Лето",15){
        @Override
        public String getDescription() {
            return "это тёплое время года.";
        }
    },
    AUTUMN("Осень",0),
    SPRING("Весна", 5);

    private int temperature;
    private String translate;

    public int getTemperature() {
        return temperature;
    }

    public String getTranslate() {
        return translate;
    }

    Seasons() {
    }

    Seasons(String translate,int temperature){
        this.temperature = temperature;
        this.translate = translate;
    }
    public String getDescription(){
        return "это холодное время года";
    }
}

