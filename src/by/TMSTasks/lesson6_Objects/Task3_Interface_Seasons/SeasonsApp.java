package by.TMSTasks.lesson6_Objects.Task3_Interface_Seasons;


public class SeasonsApp {
    public static void main(String[] args) {
        Seasons summer = Seasons.SUMMER;
        Seasons winter = Seasons.WINTER;
        Seasons autumn = Seasons.AUTUMN;
        Seasons spring = Seasons.SPRING;
        Seasons[]seasons = {summer,winter,autumn,spring};

        switch (winter){
            case AUTUMN -> System.out.println("Это осень, средняя температура: " + autumn.getTemperature() + " градусов.");
            case SUMMER -> System.out.println("Я люблю лето! Средняя температура летом: " + summer.getTemperature() + " градусов." );
            case SPRING -> System.out.println("Это весна, средняя температура весной: " + spring.getTemperature() + " градусов.");
            case WINTER -> System.out.println("Это зима, средняя температура зимой: " + winter.getTemperature() + " градусов.");
            default -> System.out.println("Это не относится к порам года.");
        }
        System.out.println("\n" + "\n");
        for (Seasons seasons1 : seasons){
            System.out.println(seasons1.getTranslate() + ", средняя температура воздуха: " + seasons1.getTemperature() + " градусов, " + seasons1.getDescription());
        }
    }

}
