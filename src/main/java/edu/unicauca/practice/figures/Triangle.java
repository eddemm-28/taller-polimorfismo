package edu.unicauca.practice.figures;

public class Triangle extends Figure{
    private final double base;
    private final double height;
//getters from atributes
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
//constructor
    public Triangle(double prmBase, double pormHeight){
        this.base = prmBase;
        this.height = pormHeight;
    }
//implementation of Interface
    @Override
    public double calculateArea() {
        return (base * height) / 2.0;
        }
    @Override
    public double calculatePerimeter() {
        double halfBase = base / 2.0;
        double side = Math.sqrt(halfBase * halfBase + height * height);
        return base + 2 * side;
    }
}
