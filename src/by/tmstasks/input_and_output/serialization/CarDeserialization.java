package by.tmstasks.input_and_output.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(
                "C:\\JavaCoreTMS\\src\\by\\TMSTasks\\lesson9_InputAndOutput\\Task4_Serialization\\saveCar.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Car car = (Car) objectInputStream.readObject();
        objectInputStream.close();
        StringBuilder result = new StringBuilder("Машина ").append(car.getCarBrand()).append(", максимальная скорость машины ").append(
                car.getCarSpeed()).append(", стоимость машины: ").append(car.getCarPrice()).append(" долларов США ($).");
        System.out.println(result);
    }
}
