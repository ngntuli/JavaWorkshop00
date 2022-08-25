package main.java.ngntuli.chapter13;

public class SimpleGenericClass<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
