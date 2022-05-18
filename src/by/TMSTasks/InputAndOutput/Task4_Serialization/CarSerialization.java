package by.TMSTasks.InputAndOutput.Task4_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CarSerialization {
    public static void main(String[] args) throws IOException {
        Car car = new Car("BMW",300,950.10);

        FileOutputStream outputStream = new FileOutputStream(
                "C:\\JavaCoreTMS\\src\\by\\TMSTasks\\lesson9_InputAndOutput\\Task4_Serialization\\saveCar.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(car);
        objectOutputStream.close();
        System.out.print("Объект сохранён.");

    }
}
