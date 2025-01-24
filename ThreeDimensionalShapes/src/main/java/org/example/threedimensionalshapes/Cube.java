package org.example.threedimensionalshapes;

public class Cube {

    public Cube(float length, float width, float height){
        this.length = length;
        this.height = height;
        this.width = width;
    }
    private float length;
    private float width;
    private float height;

    public float areaCube() {
        return length * width * height;
    }

}
