package Kasus1;

public abstract class Shape {
     protected String shapeName;
     protected double _area;
     
     public Shape(String shapeName)
     {
         this.shapeName = shapeName;
     }
     
     public double area()
     {
         return _area;
     }
     
     public String toString()
     {
         return shapeName;
     }
}
