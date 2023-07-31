package com.workintech.S18G1.modelMath;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = valueCheck(width);
        this.length = valueCheck(length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return width*length;
    }

    private double valueCheck(double value){
        return value<0?0:value;
    }
}
