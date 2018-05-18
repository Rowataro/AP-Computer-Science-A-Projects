
/**
 * Write a description of class Sample here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Circle 
{
    private double radius = 1;
    
    private static int numberOfObjects = 0;
    
    public Circle()
    {
        ++numberOfObjects;
    }
    
    public Circle(double newRadius)
    {
        if(radius < 0)
        {
            newRadius = 0;
        }
        radius = newRadius;
        ++numberOfObjects;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double getArea()
    {
        return radius * radius * Math.PI;
    }
   
    public double getCircumference()
    {
        return 2*radius*Math.PI;
    }
    public void setRadius(double newRadius) 
    {
    if (newRadius>=0)
        radius = newRadius;
    else
        radius = 0;
    }
    
    public static int getNumberOfObjects()
    {
        return numberOfObjects;
    }
    
    public String toString()
    {
        return "Radius: " + radius + "\n" + "Number Of Objects: " + numberOfObjects;
    }
    
}