package com.workintech.S18G1.modelMath;

public class Cuboid extends Rectangle{

    private double height;
    public Cuboid(double width, double length,double height) {
        super(width, length);
        this.height=valueCheck(height);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    private double valueCheck(double value){
        return value<0?0:value;
    }
}

