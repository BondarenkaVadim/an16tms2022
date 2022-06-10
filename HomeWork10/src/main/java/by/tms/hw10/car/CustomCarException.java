package by.tms.hw10.car;

public class CustomCarException extends Exception {

    public CustomCarException() {
    }

    public CustomCarException(String message) {
        super(message);
    }

    public CustomCarException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomCarException(Throwable cause) {
        super(cause);
    }

    public CustomCarException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
