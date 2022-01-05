package Soal2;

public class Circle extends Shape {
    private double radius;
    
    public Circle() {
        super();
        radius = 1.0;
    }
    
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = 1.0;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return getRadius()*getRadius()*Math.PI;
    }
    
    public double getPerimeter() {
        return 2 * Math.PI *getRadius();
    }
    
    public String toString() {
        return "A Circle with radius = " +getRadius()+" which is a subclass of " +super.toString();
    }
    
}
