package org.example.geometryutils;

import org.example.geometrylibrary.Triangle;

public class Compare {
    public Triangle compareAreaTriangle(Triangle triangle1, Triangle triangle2) {
        if(triangle1.areaTriangle() > triangle2.areaTriangle()){
            return triangle1;
        }
        return triangle2;
    }
}
