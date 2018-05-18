
/**
 * Write a description of class Chicken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chicken extends Animal
{
   public Chicken(final String name, final String color)
   {
       super(name, color);
   }
   
   public void act()
   {
       System.out.println('\n' + name + " the " + color + " chicken pecks around and says \"Cluck\".");
   }
}
