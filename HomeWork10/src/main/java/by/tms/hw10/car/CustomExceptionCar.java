package by.tms.hw10.car;

public class CustomExceptionCar extends Exception {

    public CustomExceptionCar() {
    }

    public CustomExceptionCar(String message) {
        super(message);
    }

    public CustomExceptionCar(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomExceptionCar(Throwable cause) {
        super(cause);
    }

    public CustomExceptionCar(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
