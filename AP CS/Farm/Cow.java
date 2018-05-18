
/**
 * Write a description of class Cow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cow extends Animal
{
   public Cow(final String name, final String color)
   {
       super(name, color);
   }
   
   public void act()
   {
       System.out.println('\n' + name + " the " + color +" cow stomps its hoof and says \"Moo\".");
   }
}
