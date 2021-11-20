package Kasus1;

public class Sphere extends Shape{
    private double radius; //radius in feet
    
    //cnstructor : set up the sphere
    
    public Sphere(double r)
    {
        super("Sphere");
        radius = r;
    }
    
    //return the surface areaa of the sphere
    
    @Override
    public double area()
    {
        return 4*Math.PI*radius*radius;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " of radius " + radius;
    }
}
