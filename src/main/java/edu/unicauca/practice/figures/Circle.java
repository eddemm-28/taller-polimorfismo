package edu.unicauca.practice.figures;

public class Circle  extends Figure{
    private final double radius;
//class's constructor
    public Circle(double radius) {
        this.radius = radius;
    }
//get for atribute
    public double getRadius() {
        return radius;
    } 
//implementation of Interface(Figure)
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
}
