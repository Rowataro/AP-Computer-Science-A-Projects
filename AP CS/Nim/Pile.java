
/**
 * Write a description of class Pile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pile
{
   private int marbles = 0;
   Pile()
   {
       marbles = 10 + (int)(Math.random() * 91);
   }
   
   public int getMarbles ()
   {
       return marbles;
   }
   
   public void subtract (int total)
   {
       marbles -= total;
   }
}
