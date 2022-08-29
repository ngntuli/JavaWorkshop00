package main.java.ngntuli.chapter08;

public class TimeTableException extends RuntimeException {
    public TimeTableException() {
        super("TimeTableException");
    }

    public TimeTableException(String message) {
        super(message);
    }
}
