
/**
  * Write a description of class AverageScore here.
 * Name: Jon Reyrao
 * Date: 10/31/17
 * Period: 8
 * Program Name: Rectangle
 * Program Description: A rectangle class, just like the circle class
 */
public class Rectangle
{
    private double m_length;
    private double m_width;
    
    public Rectangle()
    {
    }
    
    public Rectangle(double length, double width)
    {
        m_length = length;
    }
    
    public double getArea()
    {
        return m_length * m_width;
    }
    
    public double getPerimeter()
    {
        return 2*m_length+2*m_width;
    }
    public double getLength()
    {
        return m_length;
    }
    
    public double getWidth()
    {
        return m_width;
    }
    
    public void setLength(double length)
    {
        m_length = (length < 0)? 0 : length;
        m_length = length;
    }
    
    public void setWidth(double width)
    {
        m_width = (width < 0)? 0 : width;
        m_width = width;
    }
    
}
