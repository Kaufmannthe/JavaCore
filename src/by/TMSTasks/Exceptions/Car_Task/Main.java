package by.TMSTasks.Exceptions.Car_Task;

public class Main {
    public static void main(String[] args) throws CarException {
        Car mercedes = new Car("Mercedes", 320, 920.50);
        Car bmw = new Car("BMW", 310,920);
        Car toyota = new Car("Toyota", 290, 720);

        Car[]cars ={mercedes,bmw,toyota};

        try {
            for(Car car : cars){
                car.carStart();
            }
        }catch (CarException e){
            System.err.println(e.getMessage());
        }





    }
}


