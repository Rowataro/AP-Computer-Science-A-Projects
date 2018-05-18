/**
 * Write a description of class Faculty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Faculty
{
   public Faculty()
   {
       name = "Default Faculty";
       ad = new Address();
   }
   
   public Faculty(String newName, Address newAd)
   {
       name = newName;
       ad = newAd;
   }
   
   public String toString()
   {
       return "\nFaculty Information: " +
              "\n  Name: " + name + 
              "\nFaculty's " + ad;
   }
   public final String getName()
   {
       return name;
   }
   public void setName(final String newName)
   {
       name = newName;
   }
   
   public final Address getAddress()
   {
       return ad;
   }
   public final void setAddress(final Address newAd)
    {
        ad = newAd;
    }
    
   private String name = "";
   private Address ad = null;
}
