
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    public Person()
    {
        name = "Default Person";
        ad = new Address();
    }
    public Person(final String newName, final Address newAd)
    {
        name = newName;
        ad = newAd;
    }
    
    public void setAddress(final String streetName, final int zip)
    {
        ad.setAddress(streetName, zip);
    }
    public void setAddress(final Address newAd)
    {
        ad = newAd;
    }
     public final String getAddress()
    {
        return ad.toString();
    }
    
    public void setName(final String newName)
    {
        name = newName;
    }
    public final String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return "\nPerson's Information:" + 
                "\n  Name:" + name +
                "\n" + ad ;
    }
    
    private String name = "";
    private Address ad = null;
}
