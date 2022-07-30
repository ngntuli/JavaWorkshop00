package main.java.ngntuli.chapter08;

public class CircularShape {
    private final double PI = 3.1416;
    private double radius;

    public CircularShape(double radiusIn) {
        radius = radiusIn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * (radius * radius);
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public double calculateDiameter() {
        return 2 * radius;
    }
}
