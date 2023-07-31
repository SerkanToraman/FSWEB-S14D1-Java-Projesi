package com.workintech.S18G1.modelMath;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        heightCheck(height);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    private void heightCheck(double height){
        this.height=height<0?0:height;
    }
}
