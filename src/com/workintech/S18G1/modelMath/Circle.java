package com.workintech.S18G1.modelMath;

public class Circle {
    private double radius;

    public Circle(double radius) {
        radiusCheck(radius);
    }

    public double getRadius() {
        return radius;
    }

    private void radiusCheck(double radius){
        this.radius=radius<0?0:radius;
    }

    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
}
