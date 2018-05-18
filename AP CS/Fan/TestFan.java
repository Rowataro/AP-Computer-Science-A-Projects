/**
 * Write a description of class TestFan here.
 * Name: Jon Reyrao
 * Date: 11/6/17
 * Periiod: 8
 * Program Name: TestFan
 * Program Description: Tests the fan class by initializing and using fan objects.
 */
public class TestFan
{
    public static void main(String[] args)
    {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        
        //default constructor only available, so state will be changed through mutators.
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        
        System.out.println
        (
        "\nFan 1: " + fan1 + 
        "\n\nFan 2: " + fan2
        );
    }
}
