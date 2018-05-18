
/**
 * Write a description of class LoudDog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoudDog extends Dog
{
   public LoudDog(String name)
   {
       super(name);
   }
   public String speak()
   {
       String sound = "";
      
       for(int count = 0; count < 2; ++count)
       {
           sound += super.speak() + " ";
       }
       
       return sound;
   }
}
