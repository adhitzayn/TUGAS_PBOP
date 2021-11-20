package Kasus1;

public class Paint{
    private double coverage; //number of quare feet per gallon
    
    //constuctor : sets up the paint object
    
    public Paint(double c)
    {
        coverage = c;
        this.coverage = c;
    }
    
    //returns the amount of paint (number of gallons)
    //needed to paint the shape given as the paramete
    
    public double amount (Sphere s)
    {
        System.out.println("Computing amount for " + s);
        return s.area()/coverage;
    }
    
    public double amount(Rectangle s)
    {
        System.out.println("Computing amount for " + s);
        return s.area()/coverage;
    }
    
    public double amount(Cylinder s)
    {
        System.out.println("Computing amount for " + s);
        return s.area()/coverage;
    }
}
