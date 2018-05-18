
/**
 * Write a description of class Description here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
   public Location(final String newRel, final String newAbs)
   {
       relative = newRel;
       absolute = newAbs;
   }
   
   public String toString()
   {
       return "\n\n  The relative spot on the farm is " + relative +
              "\n\n  It can be found on " + absolute;
   }
   //general location in the farm
   private String relative = "";
   //street
   private String absolute = "";
}
