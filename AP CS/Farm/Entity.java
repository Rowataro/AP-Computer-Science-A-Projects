
/**
 * Write a description of class Entity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Entity
{
    //default action
    Entity(String newName)
    {
        name = newName;
    }
    public abstract void act();
    
    public String getName()
    {
        return name;
    };
    
    protected String name;
}
