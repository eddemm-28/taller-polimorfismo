package edu.unicauca.practice.figures;

public class Square extends Figure{
    private final double side;
//get from atribute
    public double getSide() {
        return side;
    }
//class's constructor
    public Square(double prmSide) {
        this.side = prmSide;
    }

//implementation of Interface(Figure)    
    @Override
    public double calculateArea() {
        return side*side;    
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;    
    }


}
