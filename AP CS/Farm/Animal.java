
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Animal 
{
   public Animal(final String newName, final String newColor)
   {
      name = newName;
      color = newColor;
   }
   
   public abstract void act();
   
   public final String getName()
   {
       return name;
   }
   
   public final String getColor()
   {
       return color;
   }
   
   protected String name = "";
   protected String color = "";
}
