package by.TMSTasks.lesson8_Exceptions;

public class Car_Exception extends Exception{
    public Car_Exception() {
    }

    public Car_Exception(String message) {
        super(message);
    }

    public Car_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Car_Exception(Throwable cause) {
        super(cause);
    }

    public Car_Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
