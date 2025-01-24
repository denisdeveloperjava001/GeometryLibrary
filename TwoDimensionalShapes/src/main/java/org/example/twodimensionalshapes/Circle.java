package org.example.twodimensionalshapes;

public class Circle {

    public Circle(double radius) {
        this.radius = radius;
    }
    double radius;
    double p = 3.14159;

    public double areaCircle() {
        return p * radius * radius ;
    }
    public double perimeterCircle() {
        return 2 * p * radius;
    }
}
