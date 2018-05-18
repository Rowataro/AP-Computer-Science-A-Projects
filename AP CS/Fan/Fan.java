/**
 * Write a description of class Fan here.
 * Name: Jon Reyrao
 * Date: 11/6/17
 * Periiod: 8
 * Program Name: Fan
 * Program Description: Fan class with speed, on/off, color, and radius 
 * characteristics/functions
 */
public class Fan
{
    //constants public so it can be used in the client (used for setting speeds by name, not just constants)
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    
    private boolean on = false;
    private double radius = 5; 
    private String color = new String("blue");
   
    public Fan()
    {
    }
    
    public void setSpeed(final int newSpeed)
    {
        speed = newSpeed;
    }
    public final int getSpeed()
    {
        return speed;
    }
    
    public void setOn(final boolean state)
    {
        on = state;
    }
    public final boolean isOn()
    {
        return on;
    }
    
    public void setRadius (final double newRadius)
    {
        radius = newRadius;
    }
    public final double getRadius()
    {
        return radius;
    }
    
    public void setColor(final String newColor)
    {
        color =  new String(newColor);
    }
    public final String getColor()
    {
        return color;
    }
    
    public final String toString()
    {
        if(on)
        {
            return  "\nFan speed: " + getSpeed() +
                    "\nFan color: " + getColor() +
                    "\nFan radius: " + getRadius();
        }
        else
        {
            return  "\nFan color: " + getColor() + 
                    "\nFan radius: " + getRadius() +
                    "\nfan is off";
        }
    }
}
