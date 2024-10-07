package io.github.realmariusconstantin.data;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
        radius = 5;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getArea() {
        return 2 * Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("circle: %s radius: %.1f area: %.1f",
                super.toString(), radius, getArea());
    }

}
