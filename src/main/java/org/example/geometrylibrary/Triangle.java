package org.example.geometrylibrary;

public class Triangle {

    public Triangle(double side1, double side2, double side3, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }
    double side1;
    double side2;
    double side3;
    double height;

    public double areaTriangle() {
        return side1 * height / 2;
    }
    public double perimeterTriangle() {
        return side1 + side2 + side3;
    }
}
