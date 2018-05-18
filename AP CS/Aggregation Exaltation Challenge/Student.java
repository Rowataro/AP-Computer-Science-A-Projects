public class Student
{
    public Student()
    {
        name = "Default Student";
        id = 12345;
        ad = new Address();
    }
    
    public Student(final String newName, final int newId, final Address newAd)
    {
        name = newName;
        id = newId;
        ad = newAd;
    }
    
    public String toString()
    {
        return "\nStudent Information: " +
               "\n  Name: " + name +
               "\n  Id: " + id +
               "\nStudent's " + ad;
    }
    
    public final String getName() 
    {
       return name;
    }
    public void setName(final String newName)
    {
        name = newName;
    }
    
    public final int getId()
    {
        return id;
    }
    public void setId(final int newId)
    {
        id = newId;
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
    private int id = 0;
    private Address ad = null;
}
