package org.example.geometrylibrary;

public class Rectangle {

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    float length;
    float width;

    public float areaRectangle() {
        return length * width;
    }

    public float perimeterRectangle() {
        return (length + width) * 2;
    }
}
