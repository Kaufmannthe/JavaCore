package by.TMSTasks.lesson8_Exceptions;

public class Main {
    public static void main(String[] args) throws Car_Exception {
        Car mercedes = new Car("Mercedes", 320, 920.50);
        Car bmw = new Car("BMW", 310,920);
        Car toyota = new Car("Toyota", 290, 720);

        try {
            Car.carStart(mercedes);
        }catch (Car_Exception e){
            System.err.println(e.getMessage());
        }
        try {
            Car.carStart(bmw);
        }catch (Car_Exception e){
            System.err.println(e.getMessage());
        }
        try {
            Car.carStart(toyota);
        }catch (Car_Exception e){
            System.err.println(e.getMessage());
        }



    }
}


