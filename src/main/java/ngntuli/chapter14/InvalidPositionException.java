package main.java.ngntuli.chapter14;

public class InvalidPositionException extends RuntimeException {
    public InvalidPositionException() {
        super("InvalidPositionException");
    }

    public InvalidPositionException(String message) {
        super(message);
    }
}
