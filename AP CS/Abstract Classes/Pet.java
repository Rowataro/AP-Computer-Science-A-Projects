
/**
 * Write a description of class Pet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Pet
{
    private String name;
    
    public Pet(String petName)
    {
        name = petName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public abstract String speak();
}
